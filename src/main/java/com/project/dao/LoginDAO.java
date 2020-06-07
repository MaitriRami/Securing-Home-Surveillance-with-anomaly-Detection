package com.project.dao;


import java.util.List;

import com.project.model.LoginVO;


public interface LoginDAO {
	
	public void insertUser(LoginVO loginVO);
	public List searchById(LoginVO loginVO);

}
