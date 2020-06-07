package com.project.dao;

import java.util.List;

import com.project.model.CityVO;
import com.project.model.RegisterVO;

public interface RegisterDAO {
	
	
	public void insertUser(RegisterVO registerVO);
	public List searchUser(RegisterVO registerVO);
	public List searchProfileById(RegisterVO registerVO);
	

}
