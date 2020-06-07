package com.project.service;

import java.util.List;

import com.project.model.CountryVO;

public interface CountryService {
	
	public void insertCountry(CountryVO countryVO);
	public List searchCountry(CountryVO countryVO);
	public List searchCountryById(CountryVO countryVO);

}
