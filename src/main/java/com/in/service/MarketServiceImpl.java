package com.in.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.in.domain.Market;
import com.in.persistence.MarketDAO;

@Service
public class MarketServiceImpl implements MarketService {

	@Inject
	private MarketDAO dao;
	
	@Override
	public int milkAvg() throws Exception {
		return dao.milkAvg();
	}

	@Override
	public int nMilkAvg(int Nno) throws Exception {
		return dao.nMilkAvg(Nno);
	}

	@Override
	public int riceAvg() throws Exception {
		return dao.riceAvg();
	}

	@Override
	public int nRiceAvg(int Nno) throws Exception {
		return dao.nRiceAvg(Nno);
	}

	@Override
	public int appleAvg() throws Exception {
		return dao.appleAvg();
	}

	@Override
	public int nAppleAvg(int Nno) throws Exception {
		return dao.nAppleAvg(Nno);
	}

	@Override
	public int waterAvg() throws Exception {
		return dao.waterAvg();
	}

	@Override
	public int nWaterAvg(int Nno) throws Exception {
		return dao.nWaterAvg(Nno);
	}

	@Override
	public void create(Market market) throws Exception {
		dao.create(market);
	}

	@Override
	public int milkMax() throws Exception {
		return dao.milkMax();
	}

	@Override
	public int riceMax() throws Exception {
		return dao.riceMax();
	}

	@Override
	public int appleMax() throws Exception {
		return dao.appleMax();
	}

	@Override
	public int waterMax() throws Exception {
		return dao.waterMax();
	}

	@Override
	public int milkMin() throws Exception {
		return dao.milkMin();
	}

	@Override
	public int riceMin() throws Exception {
		return dao.riceMin();
	}

	@Override
	public int appleMin() throws Exception {
		return dao.appleMin();
	}

	@Override
	public int waterMin() throws Exception {
		return dao.waterMin();
	}

	@Override
	public int nMilkMax() throws Exception {
		return dao.nMilkMax();
	}

	@Override
	public int nRiceMax() throws Exception {
		return dao.nRiceMax();
	}

	@Override
	public int nAppleMax() throws Exception {
		return dao.nAppleMax();
	}

	@Override
	public int nWaterMax() throws Exception {
		return dao.nWaterMax();
	}

	@Override
	public int nMilkMin() throws Exception {
		return dao.nMilkMin();
	}

	@Override
	public int nRiceMin() throws Exception {
		return dao.nRiceMin();
	}

	@Override
	public int nAppleMin() throws Exception {
		return dao.nAppleMin();
	}

	@Override
	public int nWaterMin() throws Exception {
		return dao.nWaterMin();
	}

	@Override
	public String nationCode(int nationCode) throws Exception {
		String nation = null;
		
		if( nationCode == 2) {
			nation = "미국";
		}else if( nationCode == 3) {
			nation = "일본";
		}else if( nationCode == 4) {
			nation = "영국";
		}else if( nationCode == 5) {
			nation = "캐나다";
		}else if( nationCode == 6) {
			nation = "프랑스";
		}else if( nationCode == 7) {
			nation = "호주";
		}else {
			nation ="대한민국";
		}
		
		return nation;
	}

	@Override
	public int count() throws Exception {
		return dao.count();
	}
}
