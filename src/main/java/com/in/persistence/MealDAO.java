package com.in.persistence;

import com.in.domain.Meal;

public interface MealDAO {
	
	
	/*필요한 정보
	 * Meal에 대한 정보 요청
	 *  1. 각 컬럼별 종합 평균치 - int 값이 리턴된다 
	 *  2. 국가 코드별 컬럼 평균치 - ||
	 *   
	 */
	
	public int oneAvg() throws Exception;
	public int nOneAvg(int Nno) throws Exception;
	
	public int twoAvg() throws Exception;
	public int nTwoAvg(int Nno) throws Exception;
	
	public int mcAvg() throws Exception;
	public int nMcAvg(int Nno) throws Exception;
	
	// create 
	public void create(Meal meal) throws Exception;
	
	//최대 최소
	public int oneMax() throws Exception;
	public int twoMax() throws Exception;
	public int mcMax() throws Exception;
	public int oneMin() throws Exception;
	public int twoMin() throws Exception;
	public int mcMin() throws Exception;
	
	//최대 최소 국가 코드리턴
	
	public int nOneMax() throws Exception;
	public int nTwoMax() throws Exception;
	public int nMcmillMax() throws Exception;
	public int nOneMin() throws Exception;
	public int nTwoMin() throws Exception;
	public int nMcMin() throws Exception;
	
	public int count() throws Exception;

}
