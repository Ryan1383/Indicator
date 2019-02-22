package com.in.persistence;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.in.domain.Member;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.in.mapper.MemberMapper";
	
	@Override
	public void regist(Member member) throws Exception {
		session.insert(namespace+".regist",member);
	}

	@Override
	public int duplicate(String id) throws Exception {
		return 	session.selectOne(namespace+".duplicate",id);
	}

	@Override
	public Member memberLogin(Member member) throws Exception {
		return session.selectOne(namespace+".memberLogin",member);
	}

	@Override
	public String findId(String email) throws Exception {
		return session.selectOne(namespace+".findId",email);
	}

	@Override
	public void updatePw(Member member) throws Exception {
		session.update(namespace+".changePw",member);
	}

	@Override
	public void updatePw2(Member member) throws Exception {
		session.update(namespace+".updatePw",member);
		
	}
	
	
	


}
