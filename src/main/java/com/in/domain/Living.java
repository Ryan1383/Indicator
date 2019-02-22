package com.in.domain;

public class Living {
	private int Nno;
	private int Lno;
	private int cityOne;
	private int cityTwo;
	private int subOne;
	private int subTwo;
	public int getNno() {
		return Nno;
	}
	public void setNno(int nno) {
		Nno = nno;
	}
	public int getLno() {
		return Lno;
	}
	public void setLno(int lno) {
		Lno = lno;
	}
	public int getCityOne() {
		return cityOne;
	}
	public void setCityOne(int cityOne) {
		this.cityOne = cityOne;
	}
	public int getCityTwo() {
		return cityTwo;
	}
	public void setCityTwo(int cityTwo) {
		this.cityTwo = cityTwo;
	}
	public int getSubOne() {
		return subOne;
	}
	public void setSubOne(int subOne) {
		this.subOne = subOne;
	}
	public int getSubTwo() {
		return subTwo;
	}
	public void setSubTwo(int subTwo) {
		this.subTwo = subTwo;
	}
	@Override
	public String toString() {
		return "Living [Nno=" + Nno + ", cityOne=" + cityOne + ", cityTwo=" + cityTwo + ", subOne=" + subOne
				+ ", subTwo=" + subTwo + "]";
	}
	
	
	
	
	
}
