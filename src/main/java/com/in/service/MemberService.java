package com.in.service;


import com.in.domain.Member;

public interface MemberService {

	public void regist(Member member) throws Exception;
	public int duplicate(String id) throws Exception;
	public Member memberLogin(Member member) throws Exception ;
	public String findId(String email) throws Exception;
	public void updatePw(Member member) throws Exception;
	
	//임시 비밀번호 생성
	public String tempPw() throws Exception;
	
	public void updatePw2(Member member) throws Exception;

}
