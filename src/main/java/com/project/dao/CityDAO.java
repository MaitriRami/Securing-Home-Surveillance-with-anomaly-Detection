package com.project.dao;

import java.util.List;

import com.project.model.CityVO;

public interface CityDAO {
	
	public void insertCity(CityVO cityVO);
	
	public List searchCity(CityVO cityVO);
	
	public List searchCityById(CityVO cityVO);
	
	public List searchCityByStateId(CityVO cityVO);
	
	
	

}
