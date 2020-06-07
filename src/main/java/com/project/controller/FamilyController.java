package com.project.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import com.project.model.LoginVO;
import com.project.model.FamilyPhotoVO;
import com.project.service.FamilyService;
import com.project.service.LoginService;
import com.project.utils.Basemethods;

@Controller
public class FamilyController {

	@Autowired
	FamilyService familyService;
	
	@Autowired
	LoginService loginService;

	@GetMapping(value="/user/loadFamily")
	public ModelAndView loadFamily()
	{
		return new ModelAndView("/user/addFamilyMember","familyPhotoVO",new FamilyPhotoVO());
	}
	
	//Family Detection
		@GetMapping(value="/user/loadDetection")
		public ModelAndView loadFamilyDetection(@ModelAttribute FamilyPhotoVO familyPhotoVO,LoginVO loginVO,HttpSession session)
		{
			String userName = Basemethods.getUser();
			loginVO.setUsername(userName);
			List userId = loginService.searchById(loginVO);
			
			LoginVO loginVOId = (LoginVO)userId.get(0);
	
			System.out.println(loginVOId.getId());
			
			session.setAttribute("familyId", loginVOId.getId());
			
			return new ModelAndView("/user/startDetection");
		}
		
		@PostMapping(value="/user/insertPhoto")
		public ModelAndView insertFamilyPhoto(@ModelAttribute FamilyPhotoVO familyPhotoVO,LoginVO loginVO,HttpServletRequest request,@RequestParam ("file") List<MultipartFile> file)
		{
			/*this.multiplePhotoService.insertForm(multipleFormVO);*/
			loginVO.setUsername(Basemethods.getUser());
			List userId = loginService.searchById(loginVO);
			LoginVO loginVOId = (LoginVO)userId.get(0);
			familyPhotoVO.setLoginVO(loginVOId);
			
			for (MultipartFile multipartFile : file) 
			{
				System.out.println("in for");
				
				
				String path =request.getSession().getServletContext().getRealPath("/");
				System.out.println("File Before Insert ::::: " + multipartFile.getOriginalFilename());			
				
				String filePath = path + "doc\\multipleFile\\";
				String fileName= multipartFile.getOriginalFilename();
				
				try {
					byte barr[]=multipartFile.getBytes();  
					BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream(filePath+"/"+fileName));  
			       
			        bout.write(barr);  
			        bout.flush();  
			        bout.close();
			        
			        familyPhotoVO.setFileName(fileName);
			        familyPhotoVO.setFilePath(filePath);
			        
			        System.out.println(fileName);
			        System.out.println(filePath);
				} 
			catch (Exception e) {
					e.printStackTrace();
				}
				
				this.familyService.insertFamilyPhoto(familyPhotoVO);
		}
			return new ModelAndView("redirect:/user/loadFamily");
		}
		
		@GetMapping(value="/user/viewFamily")
		public ModelAndView viewFamily(@ModelAttribute FamilyPhotoVO familyPhotoVO,LoginVO loginVO)
		{
			loginVO.setUsername(Basemethods.getUser());
			List userId = loginService.searchById(loginVO);
			LoginVO loginVOId = (LoginVO)userId.get(0);
			familyPhotoVO.setLoginVO(loginVOId);
			
			/*List familyIdList = familyService.searchFamilyPhotoId(familyPhotoVO);
			System.out.println("familyList:::: "+familyIdList.size());
			
			familyVO = (FamilyVO)familyIdList.get(0);
			photoVO.setFamilyVO(familyVO);*/
			List familyPhotoList = this.familyService.viewFamilyPhoto(familyPhotoVO);
			System.out.println("familyList:::: "+familyPhotoList.size());
			return new ModelAndView("/user/viewFamilyMember","familyPhotoList",familyPhotoList);
		}

	/*@PostMapping(value = "user/insertFamilyMember")
	public ModelAndView insertPhoto(@ModelAttribute FamilyVO familyVO,LoginVO loginVO,HttpServletRequest request,
			@RequestParam("file") List<MultipartFile> file) {

		loginVO.setUsername(Basemethods.getUser());
		List userId = loginService.searchById(loginVO);
		LoginVO loginVOId = (LoginVO)userId.get(0);
		familyVO.setLoginVO(loginVOId);

		this.familyService.insertFamily(familyVO);

		for (MultipartFile multipartFile : file) {
			PhotoVO photoVO = new PhotoVO();

			String path = request.getSession().getServletContext().getRealPath("/");
			System.out.println("File Before Insert ::::: " + multipartFile.getOriginalFilename());

			String filePath = path + "Doc\\multipleFile\\";
			String fileName = multipartFile.getOriginalFilename();

			try {
				byte barr[] = multipartFile.getBytes();
				BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(filePath + "/" + fileName));

				bout.write(barr);
				bout.flush();
				bout.close();

				photoVO.setMultipleFileName(fileName);
				photoVO.setMultipleFilePath(filePath);

			}

			catch (Exception e) {
				e.printStackTrace();
			}

			photoVO.setFamilyVO(familyVO);
			this.familyService.insertMultiplePhoto(photoVO);
		}

		return new ModelAndView("redirect:/user/loadFamilyMember");
	}
*/	
	
	
	@GetMapping(value="/user/deletePhoto")
	public ModelAndView deletePhoto(@ModelAttribute FamilyPhotoVO familyPhotoVO,@RequestParam int deletePhotoId)
	{
		familyPhotoVO.setId(deletePhotoId);
		List photoList = this.familyService.searchPhotoById(familyPhotoVO);
		FamilyPhotoVO familyPhotoVo = (FamilyPhotoVO)photoList.get(0);
		familyPhotoVo.setStatus(false);
		familyService.insertFamilyPhoto(familyPhotoVo);
		
		return new ModelAndView("redirect:/user/viewFamily");
	}

	
	
	
		
	
}
