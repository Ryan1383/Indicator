package com.in.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.in.domain.Living;
import com.in.persistence.LivingDAO;

@Service
public class LivingServiceImpl implements LivingService {

	@Inject
	private LivingDAO dao;
	
	@Override
	public int cityOneAvg() throws Exception {
		return dao.cityOneAvg();
	}

	@Override
	public int nCityOneAvg(int Nno) throws Exception {
		return dao.nCityOneAvg(Nno);
	}

	@Override
	public int cityTwoAvg() throws Exception {
		return dao.cityTwoAvg();
	}

	@Override
	public int nCityTwoAvg(int Nno) throws Exception {
		return dao.nCityTwoAvg(Nno);
	}

	@Override
	public int subOneAvg() throws Exception {
		return dao.subOneAvg();
	}

	@Override
	public int nSubOneAvg(int Nno) throws Exception {
		return dao.nSubOneAvg(Nno);
	}

	@Override
	public int subTwoAvg() throws Exception {
		return dao.subTwoAvg();
	}

	@Override
	public int nSubTwoAvg(int Nno) throws Exception {
		return dao.nSubTwoAvg(Nno);
	}

	@Override
	public void create(Living living) throws Exception {
		dao.create(living);
	}

	@Override
	public int cityOneMax() throws Exception {
		return dao.cityOneMax();
	}

	@Override
	public int cityTwoMax() throws Exception {
		return dao.cityTwoMax();
	}

	@Override
	public int subOneMax() throws Exception {
		return dao.subOneMax();
	}

	@Override
	public int subTwoMax() throws Exception {
		return dao.subTwoMax();
	}

	@Override
	public int cityOneMin() throws Exception {
		return dao.cityOneMin();
	}

	@Override
	public int cityTwoMin() throws Exception {
		return dao.cityTwoMin();
	}

	@Override
	public int subOneMin() throws Exception {
		return dao.subOneMin();
	}

	@Override
	public int subTwoMin() throws Exception {
		return dao.subTwoMin();
	}

	@Override
	public int nCityOneMax() throws Exception {
		return dao.nCityOneMax();
	}

	@Override
	public int nCityTwoMax() throws Exception {
		return dao.nCityTwoMax();
	}

	@Override
	public int nSubOneMax() throws Exception {
		return dao.nSubOneMax();
	}

	@Override
	public int nSubTwoMax() throws Exception {
		return dao.nSubTwoMax();
	}

	@Override
	public int nCityOneMin() throws Exception {
		return dao.nCityOneMin();
	}

	@Override
	public int nCityTwoMin() throws Exception {
		return dao.nCityTwoMin();
	}

	@Override
	public int nSubOneMin() throws Exception {
		return dao.nSubOneMin();
	}

	@Override
	public int nSubTwoMin() throws Exception {
		return dao.nSubTwoMin();
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
