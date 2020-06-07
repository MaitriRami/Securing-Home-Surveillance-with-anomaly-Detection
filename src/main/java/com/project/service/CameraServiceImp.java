package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.CameraDAO;
import com.project.model.CameraVO;

@Service
public class CameraServiceImp implements CameraService{
	
	@Autowired
	CameraDAO cameraDAO;
	
	public void insertCamera(CameraVO cameraVO)
	{
		cameraDAO.insertCamera(cameraVO);
		
	}

}
