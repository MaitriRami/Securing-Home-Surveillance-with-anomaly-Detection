package com.project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.CountryVO;
import com.project.model.DatasetVO;
import com.project.service.DatasetService;
import com.project.utils.Basemethods;

@Controller
public class DatasetController {
	
	@Autowired
	DatasetService datasetService;
	
	@GetMapping(value="/admin/loadDataset")
	public ModelAndView loadDataset() {
		return new ModelAndView("/admin/addDataset","datasetVO",new DatasetVO());
	}
	
	@PostMapping(value="/admin/insertDataset")
	public ModelAndView insertDataset(@ModelAttribute DatasetVO datasetVO,@RequestParam MultipartFile file,HttpServletRequest request) throws IOException
	{
		datasetVO.setStatus(true);
		String path=request.getServletContext().getRealPath("/");
		path=path+"Doc";
		String filename=file.getOriginalFilename();
		Basemethods.createFile(path,filename,file);
		System.out.println("uploaded");
		String datasetLink=Basemethods.uploadObject(path+"/"+filename,"dataset-data");
		Basemethods.deletefile(path+"/"+filename);
		datasetVO.setDatasetLink(datasetLink);
		this.datasetService.insertDataset(datasetVO);
		return new ModelAndView("redirect:/admin/loadDataset");
	}
	
	@GetMapping(value="/admin/viewDataset")
	public ModelAndView searchDataset(@ModelAttribute DatasetVO datasetVO)
	{
		List datasetList=this.datasetService.serachDataset(datasetVO);
		return new ModelAndView("/admin/viewDataset","datasetList",datasetList);
		
	}
	
	@GetMapping(value="/admin/deleteDataset")
	public ModelAndView deleteDataset(@ModelAttribute DatasetVO datasetVO,@RequestParam int deleteDatasetId)
	{
		datasetVO.setId(deleteDatasetId);
		List datasetList=this.datasetService.searchDatasetById(datasetVO);
		DatasetVO editDatasetVO=(DatasetVO)datasetList.get(0);
		editDatasetVO.setStatus(false);
		this.datasetService.insertDataset(editDatasetVO);
		return new ModelAndView("redirect:/admin/viewDataset");
		
		
	}
	

}
