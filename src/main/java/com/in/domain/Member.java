package com.in.domain;

public class Member {

	private int Mno;
	private String id;
	private String email;
	private String pw;
	
	
	public int getMno() {
		return Mno;
	}
	public void setMno(int mno) {
		Mno = mno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", email=" + email + ", pw=" + pw + "]";
	}
	
	
	
	
	
	
}
