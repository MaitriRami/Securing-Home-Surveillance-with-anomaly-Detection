package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.CityVO;
import com.project.model.CountryVO;
import com.project.model.LoginVO;
import com.project.model.RegisterVO;
import com.project.model.StateVO;
import com.project.service.CityService;
import com.project.service.CountryService;
import com.project.service.LoginService;
import com.project.service.RegisterService;
import com.project.service.StateService;
import com.project.utils.Basemethods;

@Controller
public class RegisterController {

	@Autowired
	RegisterService registerService;

	@Autowired
	LoginService loginService;

	@Autowired
	CityService cityService;

	@Autowired
	CountryService countryService;

	@Autowired
	StateService stateService;

	// Registration
	@PostMapping(value = "insertUser")
	public ModelAndView insertUser(@ModelAttribute RegisterVO registerVO) {

		String password = Basemethods.generatePassword();
		Basemethods.sendMail(registerVO.getLoginVO().getUsername(), password, registerVO.getFirstName());
		LoginVO loginVO = registerVO.getLoginVO();
		loginVO.setUsername(registerVO.getLoginVO().getUsername());
		loginVO.setPassword(password);
		loginVO.setEnabled("1");
		loginVO.setRole("ROLE_USER");
		this.loginService.insertUser(loginVO);
		this.registerService.insertUser(registerVO);
		return new ModelAndView("login");
	}

	@GetMapping(value = "getStateByCountry")
	public ModelAndView fetchState(CityVO cityVO, @RequestParam int id, CountryVO countryVO, StateVO stateVO) {
		countryVO.setId(id);
		stateVO.setCountryVO(countryVO);
		List stateListByCountryId = this.stateService.searchStateByCountryId(stateVO);
		System.out.println(stateListByCountryId.size());
		return new ModelAndView("/admin/jsonCity", "stateListByCountryId", stateListByCountryId);
	}

	@GetMapping(value = "getCityByState")
	public ModelAndView fetchCity(CityVO cityVO, @RequestParam int id, CountryVO countryVO, StateVO stateVO) {

		stateVO.setId(id);
		cityVO.setStateVO(stateVO);
		List cityListByStateId = this.cityService.searchCityByStateId(cityVO);
		System.out.println(cityListByStateId.size());
		return new ModelAndView("/admin/jsonRegister", "cityListByStateId", cityListByStateId);
	}

	// Edit profile
	@GetMapping(value = "/user/editProfile")
	public ModelAndView editProfile(@ModelAttribute RegisterVO registerVO, LoginVO loginVO, CityVO cityVO,
			CountryVO countryVO, StateVO stateVO, Model model) {
		loginVO.setUsername(Basemethods.getUser());
		List userId = loginService.searchById(loginVO);
		System.out.println(userId.get(0));
		LoginVO loginVOId = (LoginVO) userId.get(0);
		System.out.println(loginVOId);
		registerVO.setLoginVO(loginVOId);
		List countryList = countryService.searchCountry(countryVO);
		List stateList = stateService.searchState(stateVO);
		List cityList = cityService.searchCity(cityVO);
		model.addAttribute("countryList", countryList);
		// model.addAttribute("stateList", stateList);
		// model.addAttribute("cityList", cityList);
		List ProfileList = this.registerService.searchProfileById(registerVO);
		System.out.println(ProfileList.size());

		return new ModelAndView("/user/editProfile", "registerVO", ProfileList.get(0));
	}

	@GetMapping(value = "user/getStateByCountry")
	public ModelAndView editProfilefetchState(CityVO cityVO, @RequestParam int id, CountryVO countryVO,
			StateVO stateVO) {
		countryVO.setId(id);
		stateVO.setCountryVO(countryVO);
		List stateListByCountryId = this.stateService.searchStateByCountryId(stateVO);
		System.out.println(stateListByCountryId.size());
		return new ModelAndView("/admin/jsonCity", "stateListByCountryId", stateListByCountryId);
	}

	@GetMapping(value = "user/getCityByState")
	public ModelAndView editProfileFetchCity(CityVO cityVO, @RequestParam int id, CountryVO countryVO,
			StateVO stateVO) {

		stateVO.setId(id);
		cityVO.setStateVO(stateVO);
		List cityListByStateId = this.cityService.searchCityByStateId(cityVO);
		System.out.println(cityListByStateId.size());
		return new ModelAndView("/admin/jsonRegister", "cityListByStateId", cityListByStateId);
	}

	@PostMapping(value = "user/insertUser")
	public ModelAndView editUser(@ModelAttribute RegisterVO registerVO) {

		LoginVO loginVO = registerVO.getLoginVO();
		this.loginService.insertUser(loginVO);
		this.registerService.insertUser(registerVO);
		return new ModelAndView("redirect:/user/index");
	}

	@GetMapping(value = "admin/viewUser")
	public ModelAndView viewUser(@ModelAttribute RegisterVO registerVO) {

		List userList = this.registerService.searchUser(registerVO);
		System.out.println(userList.size());
		return new ModelAndView("admin/viewUser", "userList", userList);
	}

	// change password
	@GetMapping(value = "user/resetPassword")
	public ModelAndView changePassword() {

		return new ModelAndView("user/resetPassword");
	}

	@PostMapping(value = "user/insertPassword")
	public ModelAndView insertPassword(@ModelAttribute LoginVO loginVO, HttpServletRequest request) {
		System.out.println("hkkkkkkkkki");
		String oldPassword = request.getParameter("oldpassword");
		String newPassword = request.getParameter("newpassword");
		String userName = Basemethods.getUser();
		loginVO.setUsername(userName);
		List loginIdList = loginService.searchById(loginVO);
		loginVO = (LoginVO) loginIdList.get(0);
		String dbPassword = loginVO.getPassword();
		if (oldPassword.equals(dbPassword)) {
			loginVO.setPassword(newPassword);
			loginService.insertUser(loginVO);
			return new ModelAndView("redirect:/login");
		} else {
			return new ModelAndView("redirect:/user/resetPassword");
		}

	}

}
