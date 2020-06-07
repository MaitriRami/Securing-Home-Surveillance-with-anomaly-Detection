package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.RegisterDAO;
import com.project.model.CityVO;
import com.project.model.RegisterVO;

@Service
public class RegisterServiceImp implements RegisterService {

	@Autowired
	RegisterDAO registerDAO;

	@Transactional
	public void insertUser(RegisterVO registerVO) {
		registerDAO.insertUser(registerVO);
	}

	@Transactional
	public List searchUser(RegisterVO registerVO) {
		return registerDAO.searchUser(registerVO);
	}

	@Transactional
	public List searchProfileById(RegisterVO registerVO) {
		
		return registerDAO.searchProfileById(registerVO);

	}

}
