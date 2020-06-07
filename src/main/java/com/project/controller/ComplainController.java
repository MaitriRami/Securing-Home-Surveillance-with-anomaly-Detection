package com.project.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.ComplainVO;
import com.project.model.LoginVO;
import com.project.service.ComplainService;
import com.project.service.LoginService;
import com.project.utils.Basemethods;

@Controller
public class ComplainController {

	@Autowired
	ComplainService complainService;

	@Autowired
	LoginService loginService;

	@GetMapping(value = "/user/loadComplain")
	public ModelAndView loadComplain() {
		return new ModelAndView("/user/addComplain", "complainVO", new ComplainVO());
	}

	@PostMapping(value = "/user/insertComplain")
	public ModelAndView insertComplain(@ModelAttribute ComplainVO complainVO, LoginVO loginVO) {
		loginVO.setUsername(Basemethods.getUser());
		List userId = loginService.searchById(loginVO);
		LoginVO loginVOId = (LoginVO) userId.get(0);
		complainVO.setLoginVO(loginVOId);
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		Date date = new Date();
		complainVO.setComplainTime(dateformat.format(date));
		complainVO.setStatus(true);
		complainVO.setComplainStatus("Pending");
		complainService.insertComplain(complainVO);
		return new ModelAndView("redirect:/user/loadComplain");
	}

	@GetMapping(value = "/user/viewComplain")
	public ModelAndView viewComplain(@ModelAttribute ComplainVO complainVO, LoginVO loginVO) {
		loginVO.setUsername(Basemethods.getUser());
		List userId = loginService.searchById(loginVO);
		LoginVO loginVOId = (LoginVO) userId.get(0);

		complainVO.setLoginVO(loginVOId);
		List complainList = this.complainService.searchComplain(complainVO);
		return new ModelAndView("/user/viewComplain", "complainList", complainList);
	}

	@GetMapping(value = "/user/editComplain")
	public ModelAndView editComplain(@ModelAttribute ComplainVO complainVO, @RequestParam int editComplainId) {
		complainVO.setId(editComplainId);
		List complainList = complainService.searchComplainById(complainVO);
		return new ModelAndView("/user/addComplain", "complainVO", complainList.get(0));
	}

	@GetMapping(value = "/user/deleteComplain")
	public ModelAndView deleteComplain(@ModelAttribute ComplainVO complainVO, @RequestParam int deleteComplainId) {
		complainVO.setId(deleteComplainId);
		List complainList = this.complainService.searchComplainById(complainVO);
		ComplainVO editComplainVO = (ComplainVO) complainList.get(0);
		editComplainVO.setStatus(false);
		complainService.insertComplain(editComplainVO);
		return new ModelAndView("redirect:/user/viewComplain");
	}

	@GetMapping(value = "/admin/viewComplain")
	public ModelAndView loadReplyComplain(@ModelAttribute ComplainVO complainVO) {
		List complainList = this.complainService.displayComplain(complainVO);
		System.out.println(complainList.size());
		return new ModelAndView("/admin/viewComplain", "complainList", complainList);
	}
	
	@PostMapping(value = "/admin/replyComplain")
	public ModelAndView replyComplain(@ModelAttribute ComplainVO complainVO, LoginVO loginVO) {
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		Date date = new Date();
		complainVO.setReplyTime(dateformat.format(date));
		complainVO.setComplainStatus("Resolved");
		complainService.insertComplain(complainVO);
		return new ModelAndView("redirect:/admin/viewComplain");
	}

	@GetMapping(value="/admin/complainReply")
	public ModelAndView reply(@ModelAttribute ComplainVO complainVO, @RequestParam int complainReplyId)
	{
		complainVO.setId(complainReplyId);
		List complainList=complainService.searchComplainById(complainVO);
		return new ModelAndView("/admin/replayOfComplain","complainVO",complainList.get(0));
	}

}
