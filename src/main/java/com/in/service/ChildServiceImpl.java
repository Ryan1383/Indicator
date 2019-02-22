package com.in.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.in.domain.Child;
import com.in.persistence.ChildDAO;

@Service
public class ChildServiceImpl implements ChildService {

	@Inject
	private ChildDAO dao;
	
	@Override
	public int kinderAvg() throws Exception {
		return dao.kinderAvg();
	}

	@Override
	public int nKinderAvg(int Nno) throws Exception {
		return dao.nKinderAvg(Nno);
	}

	@Override
	public int schoolAvg() throws Exception {
		return dao.schoolAvg();
	}

	@Override
	public int nSchoolAvg(int Nno) throws Exception {
		return dao.nSchoolAvg(Nno);
	}

	@Override
	public void create(Child child) throws Exception {
		dao.create(child);
	}

	@Override
	public int kinderMax() throws Exception {
		return dao.kinderMax();
	}

	@Override
	public int schoolMax() throws Exception {
		return dao.schoolMax();
	}

	@Override
	public int kinderMin() throws Exception {
		return dao.kinderMin();
	}

	@Override
	public int schoolMin() throws Exception {
		return dao.schoolMin();
	}

	@Override
	public int nKinderMax() throws Exception {
		return dao.nKinderMax();
	}

	@Override
	public int nSchoolMax() throws Exception {
		return dao.nSchoolMax();
	}

	@Override
	public int nKinderMin() throws Exception {
		return dao.nKinderMin();
	}

	@Override
	public int nSchoolMin() throws Exception {
		return dao.nSchoolMin();
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
