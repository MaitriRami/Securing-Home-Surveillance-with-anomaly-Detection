package com.project.service;

import java.util.List;

import com.project.model.StateVO;

public interface StateService {
	
	public void insertState(StateVO stateVO);
	public List searchState(StateVO stateVO);
	public List searchStateById(StateVO stateVO);
	public List searchStateByCountryId(StateVO stateVO);

}
