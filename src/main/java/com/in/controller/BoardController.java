package com.in.controller;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.in.domain.BoardVO;
import com.in.domain.PageMaker;
import com.in.domain.ReplyVO;
import com.in.domain.SearchCriteria;
import com.in.service.BoardService;
import com.in.service.ReplyService;



@Controller 
@RequestMapping(value = "/") 
public class BoardController {

	@Inject   
	private BoardService service; 
	
	@Inject
	private ReplyService repservice;

	@RequestMapping(value = "/regist", method = RequestMethod.GET) 
	  public String registerGET(BoardVO board, Model model) throws Exception {
		return"/bbs/regist";
	}

	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	  public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception { 
		  service.regist(board); 
	    return "redirect:/list"; 
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET) 
	  public String read(@RequestParam("bno")int bno, Model model) throws Exception{
		 
		 List<ReplyVO> repList = repservice.readReply(bno);
		 BoardVO vo = service.read(bno);
		 
		 model.addAttribute(service.read(bno)); 
		 model.addAttribute("repList", repList);
		 model.addAttribute("read",vo);
		
		 
		 return "/bbs/read";
	  }
	

	  @RequestMapping(value = "/modify", method = RequestMethod.GET) 
	  public String modifyGET(int bno, Model model) throws Exception {

	    model.addAttribute(service.read(bno)); 

	    return "/bbs/modify";
	  }

	  @RequestMapping(value = "/modify", method = RequestMethod.POST)
	  public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception {

	    service.modify(board); 

	    return "redirect:/read?&bno="+board.getBno();

	  }

	  @RequestMapping(value = "/remove", method = RequestMethod.POST)
	  public String removePOST(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{

		  service.remove(bno); 

		  return "redirect:/list"; 
	  }

	  @RequestMapping(value = "/list", method = RequestMethod.GET)
	  public String listPage(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {
		
	    model.addAttribute("list", service.listSearchCriteria(cri)); 
	    PageMaker pageMaker = new PageMaker();
	    
	    pageMaker.setCri(cri);
	    pageMaker.setTotalCount(service.listSearchCount(cri));

	    model.addAttribute("pageMaker", pageMaker);

	    return "/bbs/list";
	  }
	  
	  @RequestMapping(value ="/replyWrite", method= RequestMethod.POST)
	  public String replyWrite(ReplyVO vo, RedirectAttributes rttr) throws Exception{
		  
		  repservice.writeReply(vo);
		  
		  rttr.addAttribute("bno",vo.getBno());

		  return "redirect:/read";
	  }
	  


	  @RequestMapping(value = "/replyDelete", method = RequestMethod.POST)
	  public String getReplyDelete(@RequestParam("rno") int rno,
			  @RequestParam("bno") int bno ,RedirectAttributes rttr) 
			  throws Exception {
	   
	   repservice.replyDelete(rno);
	   
	    return "redirect:/read?&bno="+bno;
	  }

	

}
