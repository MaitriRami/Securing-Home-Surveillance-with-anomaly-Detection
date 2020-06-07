package com.project.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.project.dao.CountryDAO;
import com.project.model.CountryVO;

@Service
public class CountryServiceImp implements CountryService{
	
	@Autowired
	CountryDAO countryDAO;
	
	@Transactional
	public void insertCountry(CountryVO countryVO)
	{
		countryDAO.insertCountry(countryVO);
	}
	
	@Transactional
	public List searchCountry(CountryVO countryVO)
	{
		List ls=countryDAO.searchCountry(countryVO);
		return ls;
	}
	
	@Transactional
	public List searchCountryById(CountryVO countryVO)
	{
		List ls=countryDAO.searchCountryById(countryVO);
		return ls;
	}

}
