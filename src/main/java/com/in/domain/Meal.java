package com.in.domain;

public class Meal {

	private int Nno;
	private int Mno;
	private int onep;
	private int twop;
	private int mcmill;
	
	
	public int getNno() {
		return Nno;
	}
	public void setNno(int nno) {
		Nno = nno;
	}
	public int getMno() {
		return Mno;
	}
	public void setMno(int mno) {
		Mno = mno;
	}
	public int getOnep() {
		return onep;
	}
	public void setOnep(int onep) {
		this.onep = onep;
	}
	public int getTwop() {
		return twop;
	}
	public void setTwop(int twop) {
		this.twop = twop;
	}
	public int getMcmill() {
		return mcmill;
	}
	public void setMcmill(int mcmill) {
		this.mcmill = mcmill;
	}
	@Override
	public String toString() {
		return "Meal [Nno=" + Nno + ", onep=" + onep + ", twop=" + twop + ", mcmill=" + mcmill + "]";
	}
	
	
	
}
