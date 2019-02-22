package com.in.service;

import com.in.domain.Living;

public interface LivingService {

	
	public int cityOneAvg() throws Exception;
	public int nCityOneAvg(int Nno) throws Exception;
	
	public int cityTwoAvg() throws Exception;
	public int nCityTwoAvg(int Nno) throws Exception;
	
	public int subOneAvg() throws Exception;
	public int nSubOneAvg(int Nno) throws Exception;
	
	public int subTwoAvg() throws Exception;
	public int nSubTwoAvg(int Nno) throws Exception;
	// create 
	public void create(Living living) throws Exception;
	
	//최대 최소
	public int cityOneMax() throws Exception;
	public int cityTwoMax() throws Exception;
	public int subOneMax() throws Exception;
	public int subTwoMax() throws Exception;
	public int cityOneMin() throws Exception;
	public int cityTwoMin() throws Exception;
	public int subOneMin() throws Exception;
	public int subTwoMin() throws Exception;
	
	//최대 최소 국가 코드리턴
	
	public int nCityOneMax() throws Exception;
	public int nCityTwoMax() throws Exception;
	public int nSubOneMax() throws Exception;
	public int nSubTwoMax() throws Exception;
	
	public int nCityOneMin() throws Exception;
	public int nCityTwoMin() throws Exception;
	public int nSubOneMin() throws Exception;
	public int nSubTwoMin() throws Exception;
	String nationCode(int nationCode) throws Exception;
	public int count() throws Exception;

	
}
