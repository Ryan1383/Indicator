package com.in.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.in.persistence.NationDAO;

@Service
public class NationServiceImpl implements NationService {

	@Inject
	private NationDAO dao;
	
	
	@Override
	public int USAMeal() throws Exception {
		return dao.USAMeal();
	}

	@Override
	public int USAMarket() throws Exception {
		return dao.USAMarket();
	}

	@Override
	public int USAChild() throws Exception {
		return dao.USAChild();
	}

	@Override
	public int USALiving() throws Exception {
		return dao.USALiving();
	}

	@Override
	public int JapanMeal() throws Exception {
		return dao.JapanMeal();
	}

	@Override
	public int JapanMarket() throws Exception {
		return dao.JapanMarket();
	}

	@Override
	public int JapanChild() throws Exception {
		return dao.JapanChild();
	}

	@Override
	public int JapanLiving() throws Exception {
		return dao.JapanLiving();
	}

	@Override
	public int UKMeal() throws Exception {
		return dao.UKMeal();
	}

	@Override
	public int UKMarket() throws Exception {
		return dao.UKMarket();
	}

	@Override
	public int UKChild() throws Exception {
		return dao.UKChild();
	}

	@Override
	public int UKLiving() throws Exception {
		return dao.UKLiving();
	}

	@Override
	public int CanMeal() throws Exception {
		return dao.CanMeal();
	}

	@Override
	public int CanMarket() throws Exception {
		return dao.CanMarket();
	}

	@Override
	public int CanChild() throws Exception {
		return dao.CanChild();
	}

	@Override
	public int CanLiving() throws Exception {
		return dao.CanLiving();
	}

	@Override
	public int FranceMeal() throws Exception {
		return dao.FranceMeal();
	}

	@Override
	public int FranceMarket() throws Exception {
		return dao.FranceMarket();
	}

	@Override
	public int FranceChild() throws Exception {
		return dao.FranceChild();
	}

	@Override
	public int FranceLiving() throws Exception {
		return dao.FranceLiving();
	}

	@Override
	public int AusMeal() throws Exception {
		return dao.AusMeal();
	}

	@Override
	public int AusMarket() throws Exception {
		return dao.AusMarket();
	}

	@Override
	public int AusChild() throws Exception {
		return dao.AusChild();
	}

	@Override
	public int AusLiving() throws Exception {
		return dao.AusLiving();
	}

}
