package com.in.persistence;

import com.in.domain.Child;

public interface ChildDAO {
	
	public int kinderAvg() throws Exception;
	public int nKinderAvg(int Nno) throws Exception;
	
	public int schoolAvg() throws Exception;
	public int nSchoolAvg(int Nno) throws Exception;
	// create 
	public void create(Child child) throws Exception;
	
	//최대 최소
	public int kinderMax() throws Exception;
	public int schoolMax() throws Exception;
	
	public int kinderMin() throws Exception;
	public int schoolMin() throws Exception;
	
	//최대 최소 국가 코드리턴
	
	public int nKinderMax() throws Exception;
	public int nSchoolMax() throws Exception;
	
	public int nKinderMin() throws Exception;
	public int nSchoolMin() throws Exception;
	
	public int count() throws Exception;
	
	

}
