package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.CityVO;
import com.project.model.CountryVO;
import com.project.model.StateVO;
import com.project.service.CityService;
import com.project.service.CountryService;
import com.project.service.StateService;

@Controller
public class CityController {
	
	
	@Autowired
	CityService cityService;
	
	@Autowired
	CountryService countryService;
	
	@Autowired
	StateService stateService;
	
	@GetMapping(value="/admin/loadCity")
	
	public ModelAndView loadCity(@ModelAttribute CountryVO countryVO,StateVO stateVO,Model model) {
		
		List countryList=countryService.searchCountry(countryVO);
		List stateList=stateService.searchState(stateVO);
		model.addAttribute("countryList", countryList);
		model.addAttribute("stateList",stateList);
		return new ModelAndView("/admin/addCity","cityVO",new CityVO());
	}
	
	@GetMapping(value="/admin/getStateByCountry")
	public ModelAndView fetch(CityVO cityvo,@RequestParam int id,CountryVO countryVO,StateVO stateVO)
	{
		countryVO.setId(id);
		stateVO.setCountryVO(countryVO);
		List stateListByCountryId=this.stateService.searchStateByCountryId(stateVO);
		System.out.println(stateListByCountryId.size());
		return new ModelAndView("/admin/jsonCity","stateListByCountryId",stateListByCountryId);
	}
	
	
	@PostMapping(value = "/admin/insertCity")
	public ModelAndView insertCity(@ModelAttribute CityVO cityVO){
		
		cityVO.setStatus(true);
		cityService.insertCity(cityVO);
		return new ModelAndView("redirect:/admin/loadCity");
	}
	
	@GetMapping(value = "/admin/viewCity")
	public ModelAndView viewCity(@ModelAttribute CityVO cityVO)
	{
		List cityList=cityService.searchCity(cityVO);
		return new ModelAndView("/admin/viewCity","cityList",cityList);
	}
	
	@GetMapping(value = "/admin/editCity")
	public ModelAndView editcity(@ModelAttribute StateVO stateVO,CountryVO countryVO,CityVO cityVO,Model model,@RequestParam int editCityId)
	{
		cityVO.setId(editCityId);
		List countryList=countryService.searchCountry(countryVO);
		List stateList=stateService.searchState(stateVO);
		List cityList=cityService.searchCityById(cityVO);
		System.out.println(cityList.size());
		model.addAttribute("countryList", countryList);
		model.addAttribute("stateList",stateList);
		return new ModelAndView("/admin/addCity","cityVO",cityList.get(0));
	}
	
	@GetMapping(value = "/admin/deleteCity")
	public ModelAndView deleteCity(@ModelAttribute CityVO cityVO,@RequestParam int deleteCityId)
	{
		cityVO.setId(deleteCityId);
		List cityList=cityService.searchCityById(cityVO);
		CityVO editCityVO=(CityVO)cityList.get(0);
		editCityVO.setStatus(false);
		cityService.insertCity(editCityVO);
		return new ModelAndView("redirect:/admin/viewCity");
	}
	
	

}
