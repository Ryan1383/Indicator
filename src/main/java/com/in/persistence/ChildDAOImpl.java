package com.in.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.in.domain.Child;

@Repository
public class ChildDAOImpl implements ChildDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.in.mapper.ChildMapper";

	
	@Override
	public int kinderAvg() throws Exception {
		return session.selectOne(namespace+".kinderAvg");
	}

	@Override
	public int nKinderAvg(int Nno) throws Exception {
		return session.selectOne(namespace+".nKinderAvg",Nno);
	}

	@Override
	public int schoolAvg() throws Exception {
		return session.selectOne(namespace+".schoolAvg");

	}

	@Override
	public int nSchoolAvg(int Nno) throws Exception {
		return session.selectOne(namespace+".nSchoolAvg",Nno);

	}

	@Override
	public void create(Child child) throws Exception {
		session.insert(namespace+".create", child);
	}

	@Override
	public int kinderMax() throws Exception {
		return session.selectOne(namespace+".kinderMax");

	}

	@Override
	public int schoolMax() throws Exception {
		return session.selectOne(namespace+".schoolMax");

	}

	@Override
	public int kinderMin() throws Exception {
		return session.selectOne(namespace+".kinderMin");

	}

	@Override
	public int schoolMin() throws Exception {
		return session.selectOne(namespace+".schoolMin");

	}

	@Override
	public int nKinderMax() throws Exception {
		return session.selectOne(namespace+".nKinderMax");

	}

	@Override
	public int nSchoolMax() throws Exception {
		return session.selectOne(namespace+".nSchoolMax");

	}

	@Override
	public int nKinderMin() throws Exception {
		return session.selectOne(namespace+".nKinderMin");

	}

	@Override
	public int nSchoolMin() throws Exception {
		return session.selectOne(namespace+".nSchoolMin");

	}

	@Override
	public int count() throws Exception {
		return session.selectOne(namespace+".count");
	}

}
