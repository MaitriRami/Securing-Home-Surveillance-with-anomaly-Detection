package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.CameraVO;
import com.project.model.CityVO;
import com.project.model.CountryVO;
import com.project.model.StateVO;
import com.project.service.CameraService;
import com.project.service.CityService;
import com.project.service.CountryService;
import com.project.service.StateService;

@Controller
public class CameraController {
	
	@Autowired
	CityService cityService;
	
	@Autowired
	CountryService countryService;
	
	@Autowired
	StateService stateService;
	
	@Autowired
	CameraService cameraService;
	
	@GetMapping(value="/admin/loadCamera")
	public ModelAndView loadCamera(@ModelAttribute CountryVO countryVO,StateVO stateVO,CityVO cityVO,Model model) {
		
		List countryList=this.countryService.searchCountry(countryVO);
		List stateList=this.stateService.searchState(stateVO);
		List cityList=this.cityService.searchCity(cityVO);
		model.addAttribute("countryList", countryList);
		model.addAttribute("stateList",stateList);
		model.addAttribute("cityList", cityList);
		return new ModelAndView("/admin/addCamera","cameraVO",new CameraVO()).addObject("Model", model);
	}
	
	@PostMapping(value="/admin/insertCamera")
	public ModelAndView insertCamera(@ModelAttribute CameraVO cameraVO){
		
		cameraVO.setStatus(true);
		this.insertCamera(cameraVO);
		return new ModelAndView("redirect:/admin/loadCamera");
	}

}
