package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.PackageVO;
import com.project.service.PackageService;

@Controller
public class PackageController {
	
	@Autowired
	PackageService packageService;
	
	@GetMapping(value="/admin/loadPackage")
	public ModelAndView loadPackage(@ModelAttribute PackageVO packageVO) {
		
		return new ModelAndView("/admin/addPackage","packageVO",new PackageVO());
	}
	
	@PostMapping(value = "/admin/insertPackage")
	public ModelAndView insertPackage(@ModelAttribute PackageVO packageVO){
		
		packageVO.setStatus(true);
		this.packageService.insertPackage(packageVO);
		return new ModelAndView("redirect:/admin/loadPackage");
	}
	
	@GetMapping(value = "/admin/viewPackage")
	public ModelAndView viewPackage(@ModelAttribute PackageVO packageVO)
	{
		List packageList=this.packageService.searchPackage(packageVO);
		return new ModelAndView("/admin/viewPackage","packageList",packageList);
	}
	
	@GetMapping(value = "/admin/editPackage")
	public ModelAndView editPackage(@ModelAttribute PackageVO packageVO,@RequestParam int editPackageId)
	{
		packageVO.setId(editPackageId);
		List packageList=this.packageService.searchPackageById(packageVO);
		//System.out.println(packageList.size());
		return new ModelAndView("/admin/addPackage","packageVO",packageList.get(0));
	}
	
	@GetMapping(value = "/admin/deletePackage")
	public ModelAndView deleteState(@ModelAttribute PackageVO packageVO,@RequestParam int deletePackageId)
	{
		packageVO.setId(deletePackageId);
		List packageList=this.packageService.searchPackageById(packageVO);
		PackageVO editPackageVO=(PackageVO)packageList.get(0);
		editPackageVO.setStatus(false);
		this.packageService.insertPackage(editPackageVO);
		return new ModelAndView("redirect:/admin/viewPackage");
	}
	
	@GetMapping(value="/user/loadPackage")
	public ModelAndView loadUserPackage(@ModelAttribute PackageVO packageVO) {
		
		List packageList=this.packageService.searchPackage(packageVO);
		return new ModelAndView("/user/viewPackage","packageList",packageList);
	}


	
	

}
