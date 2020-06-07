package com.project.service;

import java.util.List;

import com.project.model.LoginVO;

public interface LoginService {
	
	public void insertUser(LoginVO loginVO);
	public List searchById(LoginVO loginVO);

}
