package com.in.domain;

public class Market {
	
	private int Nno;
	private int Mno;
	private int milk;
	private int rice;
	private int apple;
	private int water;
	
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
	public int getMilk() {
		return milk;
	}
	public void setMilk(int milk) {
		this.milk = milk;
	}
	public int getRice() {
		return rice;
	}
	public void setRice(int rice) {
		this.rice = rice;
	}
	public int getApple() {
		return apple;
	}
	public void setApple(int apple) {
		this.apple = apple;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	@Override
	public String toString() {
		return "Market [Nno=" + Nno + ", milk=" + milk + ", rice=" + rice + ", apple=" + apple + ", water=" + water
				+ "]";
	}
	
	
	
	
}
