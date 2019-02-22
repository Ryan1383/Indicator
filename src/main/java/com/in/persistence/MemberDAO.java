package com.in.persistence;


import com.in.domain.Member;

public interface MemberDAO {
	
	public void regist(Member member) throws Exception;
	public int duplicate(String id) throws Exception;
	
	//로그인 하기 위해 Map
	public Member memberLogin(Member member) throws Exception ;

	
	//아이디 찾기
	public String findId(String email) throws Exception;
	
	//비밀번호 변경
	public void updatePw(Member member) throws Exception;
	public void updatePw2(Member member) throws Exception;

	
}
