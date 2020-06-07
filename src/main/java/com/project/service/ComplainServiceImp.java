package com.project.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ComplainDAO;
import com.project.model.ComplainVO;

@Service
public class ComplainServiceImp implements ComplainService {

	@Autowired
	ComplainDAO complainDAO;

	@Transactional
	public void insertComplain(ComplainVO complainVO) {
		this.complainDAO.insertComplain(complainVO);
	}

	@Transactional
	public List searchComplain(ComplainVO complainVO) {
		return complainDAO.searchComplain(complainVO);
	}
	
	@Transactional
	public List searchComplainById(ComplainVO complainVO) {
		return complainDAO.searchComplainById(complainVO);
	}
	
	@Transactional
	public List displayComplain(ComplainVO complainVO) {
		return complainDAO.displayComplain(complainVO);
	}
	
	@Transactional
	   public List<ComplainVO> viewPendingComplain()
		{
		   return this.complainDAO.viewPendingComplain();
		}
		
	@Transactional
		public List<ComplainVO> viewResolveComplain()
		{
			return this.complainDAO.viewResolveComplain();
		}

	@Transactional
	   public List<ComplainVO> viewUserPendingComplain(ComplainVO complainVO)
		{
		   return this.complainDAO.viewUserPendingComplain(complainVO);
		}
		
	@Transactional
		public List<ComplainVO> viewUserResolveComplain(ComplainVO complainVO)
		{
			return this.complainDAO.viewUserResolveComplain(complainVO);		
			
		}

		}
