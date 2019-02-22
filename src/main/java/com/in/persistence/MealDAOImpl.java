package com.in.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.in.domain.Meal;

@Repository
public class MealDAOImpl implements MealDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.in.mapper.MealMapper";


	@Override
	public int oneAvg() throws Exception {
		return session.selectOne(namespace+".oneAvg");
	}

	@Override
	public int nOneAvg(int Nno) throws Exception {
		return  session.selectOne(namespace+".nOneAvg",Nno); 
	}

	@Override
	public int twoAvg() throws Exception {
		return session.selectOne(namespace+".twoAvg");
	}

	@Override
	public int nTwoAvg(int Nno) throws Exception {
		return session.selectOne(namespace+".nTwoAvg",Nno); 
	}

	@Override
	public int mcAvg() throws Exception {
		return session.selectOne(namespace+".mcAvg");
	}

	@Override
	public int nMcAvg(int Nno) throws Exception {
		return session.selectOne(namespace+".nMcAvg",Nno); 
	}

	@Override
	public void create(Meal meal) throws Exception {
		session.insert(namespace+".create",meal);
		
	}

	@Override
	public int oneMax() throws Exception {
		return session.selectOne(namespace+".oneMax");
	}

	@Override
	public int twoMax() throws Exception {
		return session.selectOne(namespace+".twoMax");
	}

	@Override
	public int mcMax() throws Exception {
		return session.selectOne(namespace+".mcMax");
	}

	@Override
	public int oneMin() throws Exception {
		return session.selectOne(namespace+".oneMin");
	}

	@Override
	public int twoMin() throws Exception {
		return session.selectOne(namespace+".twoMin");
	}

	@Override
	public int mcMin() throws Exception {
		return session.selectOne(namespace+".mcMin");
	}

	
	@Override
	public int nOneMax() throws Exception {
		return session.selectOne(namespace+".nOneMax");
	}

	@Override
	public int nTwoMax() throws Exception {
		return session.selectOne(namespace+".nTwoMax");
	}

	@Override
	public int nMcmillMax() throws Exception {
		return session.selectOne(namespace+".nMcmillMax");
	}

	@Override
	public int nOneMin() throws Exception {
		return session.selectOne(namespace+".nOneMin");
	}

	@Override
	public int nTwoMin() throws Exception {
		return session.selectOne(namespace+".nTwoMin");
	}

	@Override
	public int nMcMin() throws Exception {
		return session.selectOne(namespace+".nMcMin");
	}

	@Override
	public int count() throws Exception {
		return session.selectOne(namespace+".count");
	}

}
