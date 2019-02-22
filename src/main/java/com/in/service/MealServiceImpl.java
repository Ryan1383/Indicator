package com.in.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.in.domain.Meal;
import com.in.persistence.MealDAO;

@Service
public class MealServiceImpl implements MealService {
	
	@Inject
	private MealDAO dao;
	
	@Override
	public int oneAvg() throws Exception {
		return dao.oneAvg();
	}

	@Override
	public int nOneAvg(int Nno) throws Exception {
		return dao.nOneAvg(Nno);
	}

	@Override
	public int twoAvg() throws Exception {
		return dao.twoAvg();
	}

	@Override
	public int nTwoAvg(int Nno) throws Exception {
		return dao.nTwoAvg(Nno);
	}

	@Override
	public int mcAvg() throws Exception {
		return dao.mcAvg();
	}

	@Override
	public int nMcAvg(int Nno) throws Exception {
		return dao.nMcAvg(Nno);
	}

	@Override
	public void inputData(Meal meal) throws Exception {
		dao.create(meal);
	}

	@Override
	public int oneMax() throws Exception {
		return dao.oneMax();
	}

	@Override
	public int twoMax() throws Exception {
		return dao.twoMax();
	}

	@Override
	public int mcMax() throws Exception {
		return dao.mcMax();
	}

	@Override
	public int oneMin() throws Exception {
		return dao.oneMin();
	}

	@Override
	public int twoMin() throws Exception {
		return dao.twoMin();
	}

	@Override
	public int mcMin() throws Exception {
		return dao.mcMin();
	}

	@Override
	public int nOneMax() throws Exception {
		return dao.nOneMax();
	}

	@Override
	public int nTwoMax() throws Exception {
		return dao.nTwoMax();
	}

	@Override
	public int nMcmillMax() throws Exception {
		return dao.nMcmillMax();
	}

	@Override
	public int nOneMin() throws Exception {
		return dao.nOneMin();
	}

	@Override
	public int nTwoMin() throws Exception {
		return dao.nTwoMin();
	}

	@Override
	public int nMcMin() throws Exception {
		return dao.nMcMin();
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
