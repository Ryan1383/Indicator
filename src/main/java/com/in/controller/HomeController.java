package com.in.controller;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.in.service.ChildService;
import com.in.service.LivingService;
import com.in.service.MarketService;
import com.in.service.MealService;
import com.in.service.NationService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	

	@Inject
	private MealService service;
	
	@Inject
	private MarketService mService;
	
	@Inject
	private ChildService cService;
	
	@Inject
	private LivingService lService;
	
	@Inject
	private NationService nService;
	
	
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {

		int mealC = service.count();
		int marketC = mService.count();
		int childC = cService.count();
		int livingC = lService.count();
		int totalC = mealC+marketC+childC+livingC;
		int num = 100;
		
		model.addAttribute("mealC",mealC);
		model.addAttribute("marketC",marketC);
		model.addAttribute("childC",childC);
		model.addAttribute("livingC",livingC);
		model.addAttribute("totalC",totalC);
		model.addAttribute("num",num);
	
		// 국가별 입력 현황
		
		//미국
		int USAMeal = nService.USAMeal();
		int USAMarket = nService.USAMarket();
		int USAChild = nService.USAChild();
		int USALiving = nService.USALiving();
		
		int USATotal = USAMeal+USAMarket+USAChild+USALiving;
		
		int USAPer =  (int) ( (double)USATotal/(double)num*100);
		
		model.addAttribute("USATotal",USATotal);
		model.addAttribute("USAPer",USAPer);
		System.out.println(USAPer);
		System.out.println(USATotal);
		
		//일본
		int JapanMeal = nService.JapanMeal();
		int JapanMarket = nService.JapanMarket();
		int JapanChild = nService.JapanChild();
		int JapanLiving = nService.JapanLiving();
		
		int JapanTotal = JapanMeal+JapanMarket+JapanChild+JapanLiving;
		int JapanPer =  (int) ( (double)JapanTotal/(double)num*100);

		model.addAttribute("JapanTotal",JapanTotal);
		model.addAttribute("JapanPer",JapanPer);

		
		//영국
		int UKMeal = nService.UKMeal();
		int UKMarket = nService.UKMarket();
		int UKChild = nService.UKChild();
		int UKLiving = nService.UKLiving();
		
		int UKTotal = UKMeal+UKMarket+UKChild+UKLiving;
		int UKPer =  (int) ( (double)UKTotal/(double)num*100);

		model.addAttribute("UKTotal",UKTotal);
		model.addAttribute("UKPer",UKPer);
		System.out.println(UKPer);

		
		//캐나다
		int CanMeal = nService.CanMeal();
		int CanMarket = nService.CanMarket();
		int CanChild = nService.CanChild();
		int CanLiving = nService.CanLiving();
		
		int CanTotal = CanMeal+CanMarket+CanChild+CanLiving;
		int CanPer =  (int) ( (double)CanTotal/(double)num*100);


		model.addAttribute("CanTotal",CanTotal);
		model.addAttribute("CanPer",CanPer);

		
		//프랑스
		int FranceMeal = nService.FranceMeal();
		int FranceMarket = nService.FranceMarket();
		int FranceChild = nService.FranceChild();
		int FranceLiving = nService.FranceLiving();
		
		int FranceTotal = FranceMeal+FranceMarket+FranceChild+FranceLiving;
		int FrancePer =  (int) ( (double)FranceTotal/(double)num*100);

		model.addAttribute("FranceTotal",FranceTotal);
		model.addAttribute("FrancePer",FrancePer);

		//호주
		int AusMeal = nService.AusMeal();
		int AusMarket = nService.AusMarket();
		int AusChild = nService.AusChild();
		int AusLiving = nService.AusLiving();
		
		int AusTotal = AusMeal+AusMarket+AusChild+AusLiving;
		int AusPer =  (int) ( (double)AusTotal/(double)num*100);

		model.addAttribute("AusTotal",AusTotal);
		model.addAttribute("AusPer",AusPer);
		
		return "/index";
	}
	@RequestMapping(value ="/index")
	public String index(Model model) throws Exception {
		
		// 필요한 정보 : 국가별 데이터 입력 수
		//				 mapper에 쿼리문 작성 필요.	매퍼마다 rno 
		// 				 전체 데이터 입력 수 
		
		// service dao 마다 각국의 auto num값 카운트 메소드 작성
		
		// ---- 카테고리에 있는 데이터 입력 수 ----- 
		
		int mealC = service.count();
		int marketC = mService.count();
		int childC = cService.count();
		int livingC = lService.count();
		int totalC = mealC+marketC+childC+livingC;
		int num = 100;
		
		model.addAttribute("mealC",mealC);
		model.addAttribute("marketC",marketC);
		model.addAttribute("childC",childC);
		model.addAttribute("livingC",livingC);
		model.addAttribute("totalC",totalC);
		model.addAttribute("num",num);

		// 국가별 입력 현황
		
		//미국
		int USAMeal = nService.USAMeal();
		int USAMarket = nService.USAMarket();
		int USAChild = nService.USAChild();
		int USALiving = nService.USALiving();
		
		int USATotal = USAMeal+USAMarket+USAChild+USALiving;
		
		int USAPer =  (int) ( (double)USATotal/(double)num*100);
		
		model.addAttribute("USATotal",USATotal);
		model.addAttribute("USAPer",USAPer);
		System.out.println(USAPer);
		System.out.println(USATotal);
		
		//일본
		int JapanMeal = nService.JapanMeal();
		int JapanMarket = nService.JapanMarket();
		int JapanChild = nService.JapanChild();
		int JapanLiving = nService.JapanLiving();
		
		int JapanTotal = JapanMeal+JapanMarket+JapanChild+JapanLiving;
		int JapanPer =  (int) ( (double)JapanTotal/(double)num*100);

		model.addAttribute("JapanTotal",JapanTotal);
		model.addAttribute("JapanPer",JapanPer);

		
		//영국
		int UKMeal = nService.UKMeal();
		int UKMarket = nService.UKMarket();
		int UKChild = nService.UKChild();
		int UKLiving = nService.UKLiving();
		
		int UKTotal = UKMeal+UKMarket+UKChild+UKLiving;
		int UKPer =  (int) ( (double)UKTotal/(double)num*100);

		model.addAttribute("UKTotal",UKTotal);
		model.addAttribute("UKPer",UKPer);
		System.out.println(UKPer);

		
		//캐나다
		int CanMeal = nService.CanMeal();
		int CanMarket = nService.CanMarket();
		int CanChild = nService.CanChild();
		int CanLiving = nService.CanLiving();
		
		int CanTotal = CanMeal+CanMarket+CanChild+CanLiving;
		int CanPer =  (int) ( (double)CanTotal/(double)num*100);


		model.addAttribute("CanTotal",CanTotal);
		model.addAttribute("CanPer",CanPer);

		
		//프랑스
		int FranceMeal = nService.FranceMeal();
		int FranceMarket = nService.FranceMarket();
		int FranceChild = nService.FranceChild();
		int FranceLiving = nService.FranceLiving();
		
		int FranceTotal = FranceMeal+FranceMarket+FranceChild+FranceLiving;
		int FrancePer =  (int) ( (double)FranceTotal/(double)num*100);

		model.addAttribute("FranceTotal",FranceTotal);
		model.addAttribute("FrancePer",FrancePer);

		//호주
		int AusMeal = nService.AusMeal();
		int AusMarket = nService.AusMarket();
		int AusChild = nService.AusChild();
		int AusLiving = nService.AusLiving();
		
		int AusTotal = AusMeal+AusMarket+AusChild+AusLiving;
		int AusPer =  (int) ( (double)AusTotal/(double)num*100);

		model.addAttribute("AusTotal",AusTotal);
		model.addAttribute("AusPer",AusPer);

		return "index";
	}
	
	
	
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	

}
