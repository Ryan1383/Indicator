package com.in.persistence;

import com.in.domain.Market;

public interface MarketDAO {

	
	public int milkAvg() throws Exception;
	public int nMilkAvg(int Nno) throws Exception;
	
	public int riceAvg() throws Exception;
	public int nRiceAvg(int Nno) throws Exception;
	
	public int appleAvg() throws Exception;
	public int nAppleAvg(int Nno) throws Exception;
	
	public int waterAvg() throws Exception;
	public int nWaterAvg(int Nno) throws Exception;
	// create 
	public void create(Market market) throws Exception;
	
	//최대 최소
	public int milkMax() throws Exception;
	public int riceMax() throws Exception;
	public int appleMax() throws Exception;
	public int waterMax() throws Exception;
	public int milkMin() throws Exception;
	public int riceMin() throws Exception;
	public int appleMin() throws Exception;
	public int waterMin() throws Exception;
	
	//최대 최소 국가 코드리턴
	
	public int nMilkMax() throws Exception;
	public int nRiceMax() throws Exception;
	public int nAppleMax() throws Exception;
	public int nWaterMax() throws Exception;
	
	public int nMilkMin() throws Exception;
	public int nRiceMin() throws Exception;
	public int nAppleMin() throws Exception;
	public int nWaterMin() throws Exception;
	
	public int count() throws Exception;

}
