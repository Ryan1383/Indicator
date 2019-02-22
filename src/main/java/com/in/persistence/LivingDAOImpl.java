package com.in.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.in.domain.Living;

@Repository
public class LivingDAOImpl implements LivingDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.in.mapper.LivingMapper";
	
	@Override
	public int cityOneAvg() throws Exception {
		return session.selectOne(namespace+".cityOneAvg");
	}

	@Override
	public int nCityOneAvg(int Nno) throws Exception {
		return session.selectOne(namespace+".nCityOneAvg",Nno);	}

	@Override
	public int cityTwoAvg() throws Exception {
		return session.selectOne(namespace+".cityTwoAvg");	}

	@Override
	public int nCityTwoAvg(int Nno) throws Exception {
		return session.selectOne(namespace+".nCityTwoAvg",Nno);	}

	@Override
	public int subOneAvg() throws Exception {
		return session.selectOne(namespace+".subOneAvg");	}

	@Override
	public int nSubOneAvg(int Nno) throws Exception {
		return session.selectOne(namespace+".nSubOneAvg",Nno);	}

	@Override
	public int subTwoAvg() throws Exception {
		return session.selectOne(namespace+".subTwoAvg");	}

	@Override
	public int nSubTwoAvg(int Nno) throws Exception {
		return session.selectOne(namespace+".nSubTwoAvg",Nno);	}

	@Override
	public void create(Living living) throws Exception {
		session.insert(namespace+".create",living);
	}

	@Override
	public int cityOneMax() throws Exception {
		return session.selectOne(namespace+".cityOneMax");	}

	@Override
	public int cityTwoMax() throws Exception {
		return session.selectOne(namespace+".cityTwoMax");	}

	@Override
	public int subOneMax() throws Exception {
		return session.selectOne(namespace+".subOneMax");	}

	@Override
	public int subTwoMax() throws Exception {
		return session.selectOne(namespace+".subTwoMax");	}

	@Override
	public int cityOneMin() throws Exception {
		return session.selectOne(namespace+".cityOneMin");	}

	@Override
	public int cityTwoMin() throws Exception {
		return session.selectOne(namespace+".cityTwoMin");	}

	@Override
	public int subOneMin() throws Exception {
		return session.selectOne(namespace+".subOneMin");	}

	@Override
	public int subTwoMin() throws Exception {
		return session.selectOne(namespace+".subTwoMin");	}

	@Override
	public int nCityOneMax() throws Exception {
		return session.selectOne(namespace+".nCityOneMax");	}

	@Override
	public int nCityTwoMax() throws Exception {
		return session.selectOne(namespace+".nCityTwoMax");	}

	@Override
	public int nSubOneMax() throws Exception {
		return session.selectOne(namespace+".nSubOneMax");	}

	@Override
	public int nSubTwoMax() throws Exception {
		return session.selectOne(namespace+".nSubTwoMax");	}

	@Override
	public int nCityOneMin() throws Exception {
		return session.selectOne(namespace+".nCityOneMin");	}

	@Override
	public int nCityTwoMin() throws Exception {
		return session.selectOne(namespace+".nCityTwoMin");	}

	@Override
	public int nSubOneMin() throws Exception {
		return session.selectOne(namespace+".nSubOneMin");	}

	@Override
	public int nSubTwoMin() throws Exception {
		return session.selectOne(namespace+".nSubTwoMin");	}

	@Override
	public int count() throws Exception {
		return session.selectOne(namespace+".count");
	}

}
