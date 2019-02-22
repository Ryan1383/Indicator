package com.in.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.in.domain.Market;

@Repository
public class MarketDAOImpl implements MarketDAO {

	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.in.mapper.MarketMapper";

	@Override
	public int milkAvg() throws Exception {
		return session.selectOne(namespace+".milkAvg");
	}

	@Override
	public int nMilkAvg(int Nno) throws Exception {
		return session.selectOne(namespace+".nMilkAvg",Nno);
	}

	@Override
	public int riceAvg() throws Exception {
		return session.selectOne(namespace+".riceAvg");
	}

	@Override
	public int nRiceAvg(int Nno) throws Exception {
		return session.selectOne(namespace+".nRiceAvg",Nno);
	}

	@Override
	public int appleAvg() throws Exception {
		return session.selectOne(namespace+".appleAvg");
	}

	@Override
	public int nAppleAvg(int Nno) throws Exception {
		return session.selectOne(namespace+".nAppleAvg",Nno);
	}

	@Override
	public int waterAvg() throws Exception {
		return session.selectOne(namespace+".waterAvg");
	}

	@Override
	public int nWaterAvg(int Nno) throws Exception {
		return session.selectOne(namespace+".nWaterAvg",Nno);
	}

	@Override
	public void create(Market market) throws Exception {
		 session.insert(namespace+".create", market);

	}

	@Override
	public int milkMax() throws Exception {
		return session.selectOne(namespace+".milkMax");
	}

	@Override
	public int riceMax() throws Exception {
		return session.selectOne(namespace+".riceMax");
	}

	@Override
	public int appleMax() throws Exception {
		return session.selectOne(namespace+".appleMax");
	}

	@Override
	public int waterMax() throws Exception {
		return session.selectOne(namespace+".waterMax");
	}

	@Override
	public int milkMin() throws Exception {
		return session.selectOne(namespace+".milkMin");
	}

	@Override
	public int riceMin() throws Exception {
		return session.selectOne(namespace+".riceMin");
	}

	@Override
	public int appleMin() throws Exception {
		return session.selectOne(namespace+".appleMin");
	}

	@Override
	public int waterMin() throws Exception {
		return session.selectOne(namespace+".waterMin");
	}

	@Override
	public int nMilkMax() throws Exception {
		return session.selectOne(namespace+".nMilkMax");
	}

	@Override
	public int nRiceMax() throws Exception {
		return session.selectOne(namespace+".nRiceMax");
	}

	@Override
	public int nAppleMax() throws Exception {
		return session.selectOne(namespace+".nAppleMax");
	}

	@Override
	public int nWaterMax() throws Exception {
		return session.selectOne(namespace+".nWaterMax");
	}

	@Override
	public int nMilkMin() throws Exception {
		return session.selectOne(namespace+".nMilkMin");
	}

	@Override
	public int nRiceMin() throws Exception {
		return session.selectOne(namespace+".nRiceMin");
	}

	@Override
	public int nAppleMin() throws Exception {
		return session.selectOne(namespace+".nAppleMin");
	}

	@Override
	public int nWaterMin() throws Exception {
		return session.selectOne(namespace+".nWaterMin");
	}

	@Override
	public int count() throws Exception {
		return session.selectOne(namespace+".count");
	}

}
