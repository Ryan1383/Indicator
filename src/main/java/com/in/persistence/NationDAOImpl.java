package com.in.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class NationDAOImpl implements NationDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.in.mapper.NationMapper";
	
	
	@Override
	public int USAMeal() throws Exception {
		return session.selectOne(namespace+".USAMeal");
	}

	@Override
	public int USAMarket() throws Exception {
		return session.selectOne(namespace+".USAMarket");
	}

	@Override
	public int USAChild() throws Exception {
		return session.selectOne(namespace+".USAChild");
	}

	@Override
	public int USALiving() throws Exception {
		return session.selectOne(namespace+".USALiving");
	}

	@Override
	public int JapanMeal() throws Exception {
		return session.selectOne(namespace+".JapanMeal");
	}

	@Override
	public int JapanMarket() throws Exception {
		return session.selectOne(namespace+".JapanMarket");
	}

	@Override
	public int JapanChild() throws Exception {
		return session.selectOne(namespace+".JapanChild");
	}

	@Override
	public int JapanLiving() throws Exception {
		return session.selectOne(namespace+".JapanLiving");
	}

	@Override
	public int UKMeal() throws Exception {
		return session.selectOne(namespace+".UKMeal");
	}

	@Override
	public int UKMarket() throws Exception {
		return session.selectOne(namespace+".UKMarket");
	}

	@Override
	public int UKChild() throws Exception {
		return session.selectOne(namespace+".UKChild");
	}

	@Override
	public int UKLiving() throws Exception {
		return session.selectOne(namespace+".UKLiving");
	}

	@Override
	public int CanMeal() throws Exception {
		return session.selectOne(namespace+".CanMeal");
	}

	@Override
	public int CanMarket() throws Exception {
		return session.selectOne(namespace+".CanMarket");
	}

	@Override
	public int CanChild() throws Exception {
		return session.selectOne(namespace+".CanChild");
	}

	@Override
	public int CanLiving() throws Exception {
		return session.selectOne(namespace+".CanLiving");
	}

	@Override
	public int FranceMeal() throws Exception {
		return session.selectOne(namespace+".FranceMeal");
	}

	@Override
	public int FranceMarket() throws Exception {
		return session.selectOne(namespace+".FranceMarket");
	}

	@Override
	public int FranceChild() throws Exception {
		return session.selectOne(namespace+".FranceChild");
	}

	@Override
	public int FranceLiving() throws Exception {
		return session.selectOne(namespace+".FranceLiving");
	}

	@Override
	public int AusMeal() throws Exception {
		return session.selectOne(namespace+".AusMeal");
	}

	@Override
	public int AusMarket() throws Exception {
		return session.selectOne(namespace+".AusMarket");
	}

	@Override
	public int AusChild() throws Exception {
		return session.selectOne(namespace+".AusChild");
	}

	@Override
	public int AusLiving() throws Exception {
		return session.selectOne(namespace+".AusLiving");
	}

}
