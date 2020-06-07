
package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.CountryVO;
import com.project.model.StateVO;
import com.project.service.CountryService;
import com.project.service.StateService;

@Controller
public class StateController {

	@Autowired
	StateService stateService;
	@Autowired
	CountryService countryService;

	@GetMapping(value = "/admin/loadState")
	public ModelAndView loadState(@ModelAttribute CountryVO countryVO,Model model) {
		List countryList = this.countryService.searchCountry(countryVO);
		model.addAttribute("countryList", countryList);
		return new ModelAndView("/admin/addState", "stateVO", new StateVO());
	}

	@PostMapping(value = "/admin/insertState")
	public ModelAndView insertState(@ModelAttribute StateVO stateVO) {

		stateVO.setStatus(true);
		this.stateService.insertState(stateVO);
		return new ModelAndView("redirect:/admin/loadState");
	}

	@GetMapping(value = "/admin/viewState")
	public ModelAndView viewState(@ModelAttribute StateVO stateVO) {
		List stateList = this.stateService.searchState(stateVO);
		return new ModelAndView("/admin/viewState", "stateList", stateList);
	}

	@GetMapping(value = "/admin/editState")
	public ModelAndView editState(@ModelAttribute StateVO stateVO, CountryVO countryVO, Model model ,@RequestParam int editStateId) {
		stateVO.setId(editStateId);
		List countryList = this.countryService.searchCountry(countryVO);
		List stateList = this.stateService.searchStateById(stateVO);
		//System.out.println(stateList.size());
		model.addAttribute("countryList", countryList);
		return new ModelAndView("/admin/addState", "stateVO", stateList.get(0)).addObject("Model", model);
	}

	@GetMapping(value = "/admin/deleteState")
	public ModelAndView deleteState(@ModelAttribute StateVO stateVO, @RequestParam int deleteStateId) {
		stateVO.setId(deleteStateId);
		List stateList = this.stateService.searchStateById(stateVO);
		StateVO editStateVO = (StateVO) stateList.get(0);
		editStateVO.setStatus(false);
		this.stateService.insertState(editStateVO);
		return new ModelAndView("redirect:/admin/viewState");
	}

}
