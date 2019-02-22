package com.in.service;

import com.in.domain.Meal;

public interface MealService {
	
	
	
	public int oneAvg() throws Exception;
	public int nOneAvg(int Nno) throws Exception;
	
	public int twoAvg() throws Exception;
	public int nTwoAvg(int Nno) throws Exception;
	
	public int mcAvg() throws Exception;
	public int nMcAvg(int Nno) throws Exception;
	
	public void inputData(Meal meal) throws Exception;
	
	public int oneMax() throws Exception;
	public int twoMax() throws Exception;
	public int mcMax() throws Exception;
	public int oneMin() throws Exception;
	public int twoMin() throws Exception;
	public int mcMin() throws Exception;
	

	public int nOneMax() throws Exception;
	public int nTwoMax() throws Exception;
	public int nMcmillMax() throws Exception;
	public int nOneMin() throws Exception;
	public int nTwoMin() throws Exception;
	public int nMcMin() throws Exception;
	
	public String nationCode(int nationCode) throws Exception;
	
	public int count() throws Exception;

}
