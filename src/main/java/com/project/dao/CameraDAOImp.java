package com.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.CameraVO;

@Repository
public class CameraDAOImp implements CameraDAO{
	
	@Autowired
	SessionFactory sessionfactory;
	
	public void insertCamera(CameraVO cameraVO) {

		Session s = sessionfactory.getCurrentSession();
		s.saveOrUpdate(cameraVO);
	}


}
