package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.GraphDAO;

@Service
@Transactional
public class GraphServiceImp implements GraphService {

	@Autowired
	GraphDAO graphDAO;
	
	public List viewPersonCount()
	{
		return this.graphDAO.viewPersonCount();
	}
}
