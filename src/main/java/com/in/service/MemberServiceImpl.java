package com.in.service;


import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.in.domain.Member;
import com.in.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{

	@Inject
	private MemberDAO dao;
	
	@Override
	public void regist(Member member) throws Exception {
		dao.regist(member);
	}

	@Override
	public int duplicate(String id) throws Exception {
		return dao.duplicate(id);
	}

	@Override
	public Member memberLogin(Member member) throws Exception {
		return dao.memberLogin(member);
	}

	@Override
	public String findId(String email) throws Exception {
		return dao.findId(email);
	}

	
	@Override
	public void updatePw(Member member) throws Exception{
		dao.updatePw(member);
	}

	@Override
	public String tempPw() throws Exception {
		char[] charSet = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
									'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 
									'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' }; 
		int idx = 0;
		StringBuffer sb = new StringBuffer();
		System.out.println("charSet.length :::: "+charSet.length);
		for (int i = 0; i < 6; i++) { 
			idx = (int) (charSet.length * Math.random()); 
			// 36 * 생성된 난수를 Int로 추출 (소숫점제거) 
			sb.append(charSet[idx]); } 
		
		return sb.toString();

	}

	@Override
	public void updatePw2(Member member) throws Exception {
		dao.updatePw2(member);
	}

}
