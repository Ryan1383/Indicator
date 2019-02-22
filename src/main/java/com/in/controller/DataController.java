package com.in.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.in.domain.Child;
import com.in.domain.Living;
import com.in.domain.Market;
import com.in.domain.Meal;
import com.in.service.ChildService;
import com.in.service.LivingService;
import com.in.service.MarketService;
import com.in.service.MealService;

@Controller
@RequestMapping(value = "/") 
public class DataController {

	@Inject
	private MealService service;
	
	@Inject
	private MarketService mService;
	
	@Inject
	private ChildService cService;
	
	@Inject
	private LivingService lService;
	
	@RequestMapping("/dataForm")
	public String dataForm() {
		return "dataForm";
	}

	
	//get 메소드 이며 dataCharts에 대한 접근시 
	@RequestMapping(value = "/dataCharts", method =RequestMethod.GET)
	public String dataChartsGet(Model model) throws Exception {
		
		// 페이지 이동하며 데이터 불러와서 model에 저장
		int oneAvg = service.oneAvg();
		int twoAvg = service.twoAvg();
		int mcAvg = service.mcAvg();
		
		model.addAttribute("oneAvg",oneAvg);
		model.addAttribute("twoAvg",twoAvg);
		model.addAttribute("mcAvg",mcAvg);
		
		//각 국가별 평균 i값은 국가코드를 매개변수로 주입한다.
		int nOneAvg,nTwoAvg,nMcAvg;
		
		//meal의 최대 최소 국가 가져오기
		int oneMax, twoMax, mcMax;
		int oneMin, twoMin, mcMin;
		String nOneMax, nTwoMax,nMcmillMax;
		String nOneMin, nTwoMin, nMcMin;
		
		for( int i = 1; i<8; i++) {
			 nOneAvg = service.nOneAvg(i);
			 nTwoAvg = service.nTwoAvg(i);
			 nMcAvg = service.nMcAvg(i);
			model.addAttribute("nOneAvg"+i,nOneAvg);
			model.addAttribute("nTwoAvg"+i,nTwoAvg);
			model.addAttribute("nMcAvg"+i,nMcAvg);
		}
		
		oneMax = service.oneMax();
		twoMax = service.twoMax();
		mcMax = service.mcMax();
		
		oneMin = service.oneMin();
		twoMin = service.twoMin();
		mcMin = service.mcMin();
		
		model.addAttribute("oneMax",oneMax);
		model.addAttribute("twoMax",twoMax);
		model.addAttribute("mcMax",mcMax);
		model.addAttribute("oneMin",oneMin);
		model.addAttribute("twoMin",twoMin);
		model.addAttribute("mcMin",mcMin);
		
		//국가별 품목 최대, 최소 가격
		
		//국가코드 리턴
		nOneMax = service.nationCode(service.nOneMax());
		nTwoMax = service.nationCode(service.nTwoMax());
		nMcmillMax = service.nationCode(service.nMcmillMax());
		nOneMin = service.nationCode(service.nOneMin());
		nTwoMin = service.nationCode(service.nTwoMin());
		nMcMin = service.nationCode(service.nMcMin());
		
		model.addAttribute("nOneMax",nOneMax);
		model.addAttribute("nTwoMax",nTwoMax);
		model.addAttribute("nMcmillMax",nMcmillMax);
		model.addAttribute("nOneMin",nOneMin);
		model.addAttribute("nTwoMin",nTwoMin);
		model.addAttribute("nMcMin",nMcMin);
		
		// ------- meal 끝 ---------
		
		// ------market 시작 -------
		
		int milkAvg = mService.milkAvg();
		int riceAvg =  mService.riceAvg();
		int appleAvg =  mService.appleAvg();
		int waterAvg =  mService.waterAvg();
		
		model.addAttribute("milkAvg",milkAvg);
		model.addAttribute("riceAvg",riceAvg);
		model.addAttribute("appleAvg",appleAvg);
		model.addAttribute("waterAvg",waterAvg);
		
		//각 국가별 평균 i값은 국가코드를 매개변수로 주입한다.
		int nMilkAvg,nRiceAvg,nAppleAvg,nWaterAvg;
		
		int milkMax, riceMax, appleMax, waterMax;
		int milkMin, riceMin, appleMin, waterMin;
		String nMilkMax, nRiceMax,nAppleMax, nWaterMax;
		String nMilkMin, nRiceMin, nAppleMin, nWaterMin;
		
		for( int i = 1; i<8; i++) {
			nMilkAvg = mService.nMilkAvg(i);
			nRiceAvg = mService.nRiceAvg(i);
			nAppleAvg = mService.nAppleAvg(i);
			nWaterAvg = mService.nWaterAvg(i);
			model.addAttribute("nMilkAvg"+i,nMilkAvg);
			model.addAttribute("nRiceAvg"+i,nRiceAvg);
			model.addAttribute("nAppleAvg"+i,nAppleAvg);
			model.addAttribute("nWaterAvg"+i,nWaterAvg);
		}
		
		milkMax = mService.milkMax();
		riceMax = mService.riceMax();
		appleMax = mService.appleMax();
		waterMax = mService.waterMax();
		
		milkMin = mService.milkMin();
		riceMin = mService.riceMin();
		appleMin = mService.appleMin();
		waterMin = mService.waterMin();
		
		model.addAttribute("milkMax",milkMax);
		model.addAttribute("riceMax",riceMax);
		model.addAttribute("appleMax",appleMax);
		model.addAttribute("waterMax",waterMax);
		
		
		model.addAttribute("milkMin",milkMin);
		model.addAttribute("riceMin",riceMin);
		model.addAttribute("appleMin",appleMin);
		model.addAttribute("waterMin",waterMin);
		
		//국가별 품목 최대, 최소 가격
		
		/*
		 * String nMilkMax, nRiceMax,nAppleMax, nWaterMax;
		String nMilkMin, nRiceMin, nAppleMin, nWaterMin;
		 */
		//국가코드 리턴
		nMilkMax = mService.nationCode(mService.nMilkMax());
		nRiceMax = mService.nationCode(mService.nRiceMax());
		nAppleMax = mService.nationCode(mService.nAppleMax());
		nWaterMax = mService.nationCode(mService.nWaterMax());
		
		
		nMilkMin = mService.nationCode(mService.nMilkMin());
		nRiceMin = mService.nationCode(mService.nRiceMin());
		nAppleMin = mService.nationCode(mService.nAppleMin());
		nWaterMin = mService.nationCode(mService.nWaterMin());
		
		model.addAttribute("nMilkMax",nMilkMax);
		model.addAttribute("nRiceMax",nRiceMax);
		model.addAttribute("nAppleMax",nAppleMax);
		model.addAttribute("nWaterMax",nWaterMax);
		
		model.addAttribute("nMilkMin",nMilkMin);
		model.addAttribute("nRiceMin",nRiceMin);
		model.addAttribute("nAppleMin",nAppleMin);
		model.addAttribute("nWaterMin",nWaterMin);
		
		// --------market  끝----------------------
		
		// --------child 시작--------------
		int kinderAvg = cService.kinderAvg();
		int schoolAvg = cService.schoolAvg();
		
		model.addAttribute("kinderAvg",kinderAvg);
		model.addAttribute("schoolAvg",schoolAvg);
		
		//각 국가별 평균 i값은 국가코드를 매개변수로 주입한다.
		int nKinderAvg,nSchoolAvg;
		
		//meal의 최대 최소 국가 가져오기
		int kinderMax, schoolMax;
		int kinderMin, schoolMin;
		String nKinderMax, nSchoolMax;
		String nKinderMin, nSchoolMin;
		
		for( int i = 1; i<8; i++) {
			nKinderAvg = cService.nKinderAvg(i);
			nSchoolAvg = cService.nSchoolAvg(i);
			model.addAttribute("nKinderAvg"+i,nKinderAvg);
			model.addAttribute("nSchoolAvg"+i,nSchoolAvg);
		}
		
		kinderMax = cService.kinderMax();
		schoolMax = cService.schoolMax();
		
		kinderMin = cService.kinderMin();
		schoolMin = cService.schoolMin();
		
		model.addAttribute("kinderMax",kinderMax);
		model.addAttribute("schoolMax",schoolMax);
		model.addAttribute("kinderMin",kinderMin);
		model.addAttribute("schoolMin",schoolMin);
		
		//국가별 품목 최대, 최소 가격
		
		//국가코드 리턴
		nKinderMax = cService.nationCode(cService.nKinderMax());
		nSchoolMax = cService.nationCode(cService.nSchoolMax());
		
		nKinderMin = cService.nationCode(cService.nKinderMin());
		nSchoolMin = cService.nationCode(cService.nSchoolMin());
		
		model.addAttribute("nKinderMax",nKinderMax);
		model.addAttribute("nSchoolMax",nSchoolMax);
		model.addAttribute("nKinderMin",nKinderMin);
		model.addAttribute("nSchoolMin",nSchoolMin);
		
		//--------- child 끝 --------------
		
		
		//--------- living 시작 --------------
		
		int cityOneAvg = lService.cityOneAvg();
		int cityTwoAvg = lService.cityTwoAvg();
		int subOneAvg = lService.subOneAvg();
		int subTwoAvg = lService.subTwoAvg();
		
		model.addAttribute("cityOneAvg",cityOneAvg);
		model.addAttribute("cityTwoAvg",cityTwoAvg);
		model.addAttribute("subOneAvg",subOneAvg);
		model.addAttribute("subTwoAvg",subTwoAvg);
		
		//각 국가별 평균 i값은 국가코드를 매개변수로 주입한다.
		int nCityOneAvg,nCityTwoAvg,nSubOneAvg,nSubTwoAvg;
		
		int cityOneMax, cityTwoMax, subOneMax, subTwoMax;
		int cityOneMin, cityTwoMin, subOneMin, subTwoMin;
		String nCityOneMax, nCityTwoMax,nSubOneMax, nSubTwoMax;
		String nCityOneMin, nCityTwoMin, nSubOneMin, nSubTwoMin;
		
		for( int i = 1; i<8; i++) {
			nCityOneAvg = lService.nCityOneAvg(i);
			nCityTwoAvg = lService.nCityTwoAvg(i);
			nSubOneAvg = lService.nSubOneAvg(i);
			nSubTwoAvg = lService.nSubTwoAvg(i);
			model.addAttribute("nCityOneAvg"+i,nCityOneAvg);
			model.addAttribute("nCityTwoAvg"+i,nCityTwoAvg);
			model.addAttribute("nSubOneAvg"+i,nSubOneAvg);
			model.addAttribute("nSubTwoAvg"+i,nSubTwoAvg);
		}
		
		cityOneMax = lService.cityOneMax();
		cityTwoMax = lService.cityTwoMax();
		subOneMax = lService.subOneMax();
		subTwoMax = lService.subTwoMax();
		
		cityOneMin = lService.cityOneMin();
		cityTwoMin = lService.cityTwoMin();
		subOneMin = lService.subOneMin();
		subTwoMin = lService.subTwoMin();
		
		
		model.addAttribute("cityOneMax",cityOneMax);
		model.addAttribute("cityTwoMax",cityTwoMax);
		model.addAttribute("subOneMax",subOneMax);
		model.addAttribute("subTwoMax",subTwoMax);
		
		
		model.addAttribute("cityOneMin",cityOneMin);
		model.addAttribute("cityTwoMin",cityTwoMin);
		model.addAttribute("subOneMin",subOneMin);
		model.addAttribute("subTwoMin",subTwoMin);
		
		//국가별 품목 최대, 최소 가격
		
		
		//국가코드 리턴
		nCityOneMax = lService.nationCode(lService.nCityOneMax());
		nCityTwoMax = lService.nationCode(lService.nCityTwoMax());
		nSubOneMax = lService.nationCode(lService.nSubOneMax());
		nSubTwoMax = lService.nationCode(lService.nSubTwoMax());
		
		
		nCityOneMin = lService.nationCode(lService.nCityOneMin());
		nCityTwoMin = lService.nationCode(lService.nCityTwoMin());
		nSubOneMin = lService.nationCode(lService.nSubOneMin());
		nSubTwoMin = lService.nationCode(lService.nSubTwoMin());
		
		model.addAttribute("nCityOneMax",nCityOneMax);
		model.addAttribute("nCityTwoMax",nCityTwoMax);
		model.addAttribute("nSubOneMax",nSubOneMax);
		model.addAttribute("nSubTwoMax",nSubTwoMax);
		
		model.addAttribute("nCityOneMin",nCityOneMin);
		model.addAttribute("nCityTwoMin",nCityTwoMin);
		model.addAttribute("nSubOneMin",nSubOneMin);
		model.addAttribute("nSubTwoMin",nSubTwoMin);
		
		return "dataCharts";
	}
	
	@RequestMapping(value = "/dataMeal", method = RequestMethod.POST)
	public String dataInputMeal(Meal meal,Model model) throws Exception {
		System.out.println(meal);
		service.inputData(meal);
		
		return "dataForm";
	}
	
	@RequestMapping(value = "/dataMarket", method = {RequestMethod.GET,RequestMethod.POST})
	public String dataInputMarket(Market market,Model model) throws Exception {
		System.out.println(market);
		mService.create(market);
		
		return "dataForm";
	}
	
	@RequestMapping(value = "/dataChild", method = {RequestMethod.GET,RequestMethod.POST})
	public String dataInputChild(Child child,Model model) throws Exception {
		System.out.println(child);
		cService.create(child);
		
		return "dataForm";
	}
	
	
	@RequestMapping(value = "/dataLiving", method = {RequestMethod.GET,RequestMethod.POST})
	public String dataInputLiving(Living living,Model model) throws Exception {
		System.out.println(living);
		lService.create(living);
		
		return "dataForm";
	}
	
	
	
	
	/*dataCharts 클릭 시 
	 dataCharts는 분석페이지이며 바로 로딩시 데이터 베이스에서 디폴트 정보를
	 로드해서 차트에 반영하여 보여주도록 한다.
	 데이터를 읽는 read 메소드를 만들어야 할듯하다.
	 dataCharts 처음 이동 매핑 안에 service로 메소드를 호출하여 가져와야할듯 하다.
	*/
	
	
}
