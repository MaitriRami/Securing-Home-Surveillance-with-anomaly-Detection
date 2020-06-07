package com.project.dao;

import java.util.List;

import com.project.model.CountryVO;


public interface CountryDAO {
	
	public void insertCountry(CountryVO countryVO);
	
	public List searchCountry(CountryVO countryVO);
	
	public List searchCountryById(CountryVO countryVO);
	

}
