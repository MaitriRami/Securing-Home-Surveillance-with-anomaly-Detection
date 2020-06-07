package com.project.service;


import java.util.List;
import javax.transaction.Transactional;

import com.project.model.RegisterVO;

public interface RegisterService {
	
	public void insertUser(RegisterVO registerVO);
	public List searchUser(RegisterVO registerVO);
	public List searchProfileById(RegisterVO registerVO);
	

}
