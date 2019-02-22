package com.in.domain;

public class Child {
	
	private int Nno;
	private int Cno;
	private int kinder;
	private int school;
	public int getNno() {
		return Nno;
	}
	public void setNno(int nno) {
		Nno = nno;
	}
	public int getCno() {
		return Cno;
	}
	public void setCno(int cno) {
		Cno = cno;
	}
	public int getKinder() {
		return kinder;
	}
	public void setKinder(int kinder) {
		this.kinder = kinder;
	}
	public int getSchool() {
		return school;
	}
	public void setSchool(int school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Child [Nno=" + Nno + ", kinder=" + kinder + ", school=" + school + "]";
	}
	
	
}
