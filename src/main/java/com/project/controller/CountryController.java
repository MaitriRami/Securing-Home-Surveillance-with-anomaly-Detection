package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.CountryVO;
import com.project.service.CountryService;

@Controller
public class CountryController {
	
	@Autowired
	CountryService countryService;

	@GetMapping(value="/admin/loadCountry")
	public ModelAndView loadCountry() {
		return new ModelAndView("/admin/addCountry","countryVO",new CountryVO());
	}
	
	@PostMapping(value = "/admin/insertCountry")
	public ModelAndView insertCountry(@ModelAttribute CountryVO countryVO){
		countryVO.setStatus(true);
		this.countryService.insertCountry(countryVO);
		return new ModelAndView("redirect:/admin/loadCountry");
	}
	
	@GetMapping(value = "/admin/viewCountry")
	public ModelAndView viewCountry(@ModelAttribute CountryVO countryVO)
	{
		List countryList=this.countryService.searchCountry(countryVO);
		return new ModelAndView("/admin/viewCountry","countryList",countryList);
	}
	
	@GetMapping(value = "/admin/editCountry")
	public ModelAndView editCountry(@ModelAttribute CountryVO countryVO,@RequestParam int editCountryId)
	{
		countryVO.setId(editCountryId);
		List countryList=this.countryService.searchCountryById(countryVO);
		//System.out.println(countryList.size());
		return new ModelAndView("/admin/addCountry","countryVO",countryList.get(0));
	}
	
	@GetMapping(value = "/admin/deleteCountry")
	public ModelAndView deleteCountry(@ModelAttribute CountryVO countryVO,@RequestParam int deleteCountryId)
	{
		countryVO.setId(deleteCountryId);
		List countryList=this.countryService.searchCountryById(countryVO);
		CountryVO editCountryVO=(CountryVO)countryList.get(0);
		editCountryVO.setStatus(false);
		this.countryService.insertCountry(editCountryVO);
		return new ModelAndView("redirect:/admin/viewCountry");
	}


}
