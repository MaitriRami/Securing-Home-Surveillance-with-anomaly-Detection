package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.StateDAO;
import com.project.model.CityVO;
import com.project.model.StateVO;

@Service
public class StateServiceImp implements StateService {

	@Autowired
	StateDAO stateDAO;

	@Transactional
	public void insertState(StateVO stateVO) {

		stateDAO.insertState(stateVO);
	}

	@Transactional
	public List searchState(StateVO stateVO) {
		return stateDAO.searchState(stateVO);

	}

	@Transactional
	public List searchStateById(StateVO stateVO) {
		return stateDAO.searchStateById(stateVO);

	}
	
	@Transactional
	public List searchStateByCountryId(StateVO stateVO)
	{
		return this.stateDAO.searchStateByCountryId(stateVO);
	}

}
