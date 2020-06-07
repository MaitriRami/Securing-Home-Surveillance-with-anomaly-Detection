package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.LoginDAO;
import com.project.model.LoginVO;


@Service
public class LoginServiceImp implements LoginService {
	
	@Autowired
	LoginDAO loginDAO;
	
	@Transactional
	public void insertUser(LoginVO loginVO)
	{
		loginDAO.insertUser(loginVO);
	}
	@Transactional
	public List searchById(LoginVO loginVO)
	{
		return loginDAO.searchById(loginVO);
	}
	

}
