package com.in.controller;

import javax.inject.Inject;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.in.domain.Member;
import com.in.service.MemberService;

@Controller 

@RequestMapping(value = "/") 
public class MemberController {
	
	@Inject
	private MemberService memService;

	@Inject
	private JavaMailSender mailSender;
	
	
	@RequestMapping(value ="/idForgot", method =RequestMethod.GET)
	public String idForgotGET() {
		return "login/idForgot";
	}
	@RequestMapping(value ="/idForgot", method =RequestMethod.POST)
	public ModelAndView idForgotPOST(@RequestParam("email")String email,Model model) throws Exception {
		ModelAndView mav = new ModelAndView("/login/idResult");
		
		try {
		String resultId = memService.findId(email);
		
			if(resultId == null) {
			
			}else {
				mav.addObject("msg","결과 : " +resultId);
				System.out.println(resultId);
			}
			
		}catch(Exception e) {
			mav.addObject("msg", "결과 : 아이디가 존재 하지 않습니다.");
		}
		return mav;
	}
	
	
	@RequestMapping(value ="/forgot", method =RequestMethod.GET)
	public String forgotForm() {
		return "login/forgot";
	}
	
	@RequestMapping(value ="/forgot", method =RequestMethod.POST)
	public String forgotFormPOST(HttpServletRequest request,@RequestParam("userMail")String email ) throws Exception {
			
			//랜덤 비밀번호 생성
			String tempPw = memService.tempPw();
			Member member = new Member();
			member.setEmail(email);
			member.setPw(tempPw);
			System.out.println(tempPw);
		    String setfrom = "chaosmos1383@gmail.com";         
		    String tomail  = request.getParameter("userMail");     // 받는 사람 이메일
		    String title   = "[Indicator] 에서 새로운 비밀번호 요청 확인";      // 제목
		    String content = "귀하의 요청에 의하여 새로운 비밀번호가 생성되었습니다 : "+tempPw  
		    				+ "\n  임시 비밀번호를 사용하여 로그인 후 비밀번호를 꼭 변경해주세요!";    // 내용
		   
		    memService.updatePw(member);
		    
		    try {
		      MimeMessage message = mailSender.createMimeMessage();
		      MimeMessageHelper messageHelper 
		                        = new MimeMessageHelper(message, true, "UTF-8");
		 
		      messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
		      messageHelper.setTo(tomail);     // 받는사람 이메일
		      messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
		      messageHelper.setText(content);  // 메일 내용
		     
		      mailSender.send(message);
		    } catch(Exception e){
		      System.out.println(e);
		    }
		
		
		return "login/forgotSend";
	}
	
	
	
	@RequestMapping(value ="/forgotSend", method =RequestMethod.GET)
	public String forgotSend() {
		return "login/forgotSend";
	}
	
	
	@RequestMapping("/memberRegister")
	public String registerForm() {
		return "register/register";
	}
	
	
	//register에서 post로 온 id의 중복처리
	@RequestMapping("/duplicate")
	public String duplicate(ServletRequest request,Model model) throws Exception {
		
		int msg = memService.duplicate(request.getParameter("id"));
		
		System.out.println(msg);
		
		model.addAttribute("dup",msg);
		
		return "register/duplicate";
		
	}
	
	
	@RequestMapping("/MemberRegist")
	public String regist(Member member) throws Exception {
		memService.regist(member);
		
		return "register/success";
	}
	
	 
	 @RequestMapping(value="/login" ,method =RequestMethod.GET)
	 public String login() {
		 return "login/login";
	 }
	
	 @RequestMapping(value="/login" ,method =RequestMethod.POST)
	 public ModelAndView login(HttpServletRequest request, Member member,Model model) throws Exception {
	  ModelAndView mav = new ModelAndView("/login/loginSuccess");
	  
	  String uId = request.getParameter("id");
	  String uPw = request.getParameter("password");
	  
	  
	  int logId = memService.duplicate(uId);
	  
	  String location = "index";
	  if( !(logId == 0 ) ) {
	  
	  Member loginInfo = memService.memberLogin(member);
	 
	  if(uId.equals(loginInfo.getId()) && uPw.equals(loginInfo.getPw())) {
		   mav.addObject("msg", "로그인에 성공하였습니다.");
		   request.getSession().setAttribute("loginInfo", loginInfo);
		   request.getSession().setMaxInactiveInterval(60*30);// session의 유지시간을 30분으로 한다.
		   model.addAttribute("location",location);
		   request.getSession().setAttribute("userId", loginInfo.getId());
		   System.out.println(loginInfo.getId());
		   
		   
		  }else if(!(uPw.equals(loginInfo.getPw()))) {
			  mav.addObject("msg", "비밀번호가 틀립니다.");
			  location = "login";
			  model.addAttribute("location",location);
		  }
	  }else {
			  mav.addObject("msg", "존재하지 않는 아이디 입니다.");
			  location = "login";
			  model.addAttribute("location",location);
	  }
	  return mav;
	 }

	 @RequestMapping(value="/logout")
	 public ModelAndView logout(HttpServletRequest request) throws Exception {
	  request.getSession().removeAttribute("loginInfo");
	  request.getSession().removeAttribute("userId");
	  
	  
	  ModelAndView mav = new ModelAndView("/login/logout");
	  mav.addObject("msg", "로그아웃되었습니다.");
	  
	  
	  
	  return mav;
	 }

	 
	 //로그인 인터셉터
	 @RequestMapping(value="/needLogin")
	 public ModelAndView needLogin() throws Exception {
	  ModelAndView mav = new ModelAndView("/login/loginWarning");
	  mav.addObject("msg", "로그인 후 이용해주시기 바랍니다.");
	 
	  return mav;
	 }
	 
	 
	 @RequestMapping(value="/mypage", method=RequestMethod.GET)
	 public String mypageGET() {
		 
		 return "login/mypage";
	 }
	 
	 @RequestMapping(value="/mypage", method=RequestMethod.POST)
	 public ModelAndView mypagePOST(HttpServletRequest request,
			 @RequestParam("id")String id,@RequestParam("pw")String pw) throws Exception {
		 ModelAndView mav = new ModelAndView("/login/updatePw");
		 
		 String userId = (String) request.getSession().getAttribute("userId");
		 
		 Member member = new Member();
		 
		 if(userId != null) {
			 member.setId(userId);
			 member.setPw(pw);
		 }
		 try {
			 memService.updatePw2(member);
			 System.out.println(member);
			 mav.addObject("msg", "비밀변호가 변경되었습니다.");
		 }catch(Exception e){
			 mav.addObject("msg", "에러가 발생하였습니다.");

		 }
		 return mav;
	 }
}
