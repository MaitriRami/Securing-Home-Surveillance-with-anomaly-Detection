package com.project.service;

import java.util.List;
import javax.transaction.Transactional;

import com.project.model.CityVO;

public interface CityService {

	public void insertCity(CityVO cityVO);

	public List searchCity(CityVO cityVO);

	public List searchCityById(CityVO cityVO);
	
	public List searchCityByStateId(CityVO cityVO);
	
	

}
