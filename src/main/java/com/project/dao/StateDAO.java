package com.project.dao;

import java.util.List;

import com.project.model.CityVO;
import com.project.model.StateVO;

public interface StateDAO {

	public void insertState(StateVO stateVO);

	public List searchState(StateVO stateVO);

	public List searchStateById(StateVO stateVO);

	public List searchStateByCountryId(StateVO stateVO);
	
	

}
