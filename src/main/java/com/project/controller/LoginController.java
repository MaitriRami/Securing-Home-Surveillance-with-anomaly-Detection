package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.CityVO;
import com.project.model.ComplainVO;
import com.project.model.CountryVO;
import com.project.model.FeedbackVO;
import com.project.model.LoginVO;
import com.project.model.RegisterVO;
import com.project.model.StateVO;
import com.project.service.CityService;
import com.project.service.ComplainService;
import com.project.service.CountryService;
import com.project.service.FeedbackService;
import com.project.service.GraphService;
import com.project.service.LoginService;
import com.project.service.RegisterService;
import com.project.service.StateService;
import com.project.utils.Basemethods;

@Controller
public class LoginController {

	@Autowired
	private GraphService GraphService;
	
	@Autowired
	CityService cityService;

	@Autowired
	CountryService countryService;

	@Autowired
	StateService stateService;

	@Autowired
	LoginService loginService;
	
	@Autowired
	RegisterService registerService;

	@Autowired
	ComplainService complainService;
	
	@Autowired
	FeedbackService FeedbackService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView loadLogin() {

		return new ModelAndView("login");
	}

	@RequestMapping(value = "/admin/index", method = RequestMethod.GET)
	public ModelAndView adminIndex(Model model,@ModelAttribute LoginVO loginVO, RegisterVO registerVO,ComplainVO complainVO,FeedbackVO feedbackVO,HttpSession session) {
		
		String userName = Basemethods.getUser();
		loginVO.setUsername(userName);
		List userList = loginService.searchById(loginVO);	
		LoginVO loginVO2 = (LoginVO)userList.get(0);

		registerVO.setLoginVO(loginVO2);
		
		List User = this.registerService.searchProfileById(registerVO);
		System.out.println(User.size());
		RegisterVO regVO = (RegisterVO)User.get(0);

		session.setAttribute("firstName", regVO.getFirstName());
		session.setAttribute("lastName", regVO.getLastName());
		
		List totalComplainList = this.complainService.displayComplain(complainVO);
		List pendingComplainList = this.complainService.viewPendingComplain();
		List resolveComplainList = this.complainService.viewResolveComplain();
		List feedbackList = this.FeedbackService.searchFeedback(feedbackVO);
		
		
		List graphList = this.GraphService.viewPersonCount();
		
		model.addAttribute("totalComplainList",totalComplainList.size());
		model.addAttribute("pendingComplainList",pendingComplainList.size());
		model.addAttribute("resolveComplainList",resolveComplainList.size());
		model.addAttribute("feedbackList",feedbackList.size());
		model.addAttribute("graphList",graphList);
		
		
		return new ModelAndView("admin/index","data",model);
		
	}

	@RequestMapping(value = "/user/index", method = RequestMethod.GET)
	public ModelAndView userIndex(Model model,HttpSession session,@ModelAttribute LoginVO loginVO, RegisterVO registerVO,ComplainVO complainVO,FeedbackVO feedbackVO) {
		
		loginVO.setUsername(Basemethods.getUser());
		List userId = loginService.searchById(loginVO);
	
		/*System.out.println(userId.get(0));*/
		LoginVO loginVOId = (LoginVO) userId.get(0);
		/*System.out.println(loginVOId);*/
		registerVO.setLoginVO(loginVOId);
		
	
		List User = registerService.searchProfileById(registerVO);
		RegisterVO regVO = (RegisterVO)User.get(0);
		
		
		session.setAttribute("firstName", regVO.getFirstName());
		session.setAttribute("lastName", regVO.getLastName());
		
		complainVO.setLoginVO(loginVOId);
		feedbackVO.setLoginVO(loginVOId);
		List totalComplainList = this.complainService.searchComplain(complainVO);
		List pendingComplainList = this.complainService.viewUserPendingComplain(complainVO);
		List resolveComplainList = this.complainService.viewUserResolveComplain(complainVO);
		List feedbackList = this.FeedbackService.searchUserFeedback(feedbackVO);
		
		model.addAttribute("totalComplainList",totalComplainList.size());
		model.addAttribute("pendingComplainList",pendingComplainList.size());
		model.addAttribute("resolveComplainList",resolveComplainList.size());
		model.addAttribute("feedbackList",feedbackList.size());
		return new ModelAndView("user/index","data",model);
	}

	@RequestMapping(value = "/logout", method = { RequestMethod.POST, RequestMethod.GET })
	public String viewUserDetails(ModelMap model, HttpServletResponse response, HttpServletRequest request) {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
			request.getSession().invalidate();
			request.getSession().setAttribute("tempStatus", "success");
			request.getSession().setAttribute("statusText", "Logout Successfully!");
		}
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView load() {

		return new ModelAndView("login");
	}

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView load403() {

		return new ModelAndView("login");
	}

	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public ModelAndView error() {

		return new ModelAndView("login");
	}

	@GetMapping(value = "/register")
	public ModelAndView registration(@ModelAttribute CountryVO countryVO, StateVO stateVO, CityVO cityVO, Model model) {

		List countryList = this.countryService.searchCountry(countryVO);
		List stateList = this.stateService.searchState(stateVO);
		List cityList = this.cityService.searchCity(cityVO);
		model.addAttribute("countryList", countryList);
		model.addAttribute("stateList", stateList);
		model.addAttribute("cityList", cityList);
		return new ModelAndView("register", "registerVO", new RegisterVO()).addObject("Model", model);
	}

}
