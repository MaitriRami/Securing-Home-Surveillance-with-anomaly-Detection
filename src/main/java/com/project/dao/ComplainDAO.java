package com.project.dao;

import java.util.List;

import com.project.model.ComplainVO;

public interface ComplainDAO {
	
	public void insertComplain(ComplainVO complainVO);
	public List<ComplainVO> searchComplain(ComplainVO complainVO);
	public List<ComplainVO> searchComplainById(ComplainVO complainVO);
	public List<ComplainVO> displayComplain(ComplainVO complainVO);
	public List<ComplainVO> viewPendingComplain();
	public List<ComplainVO> viewResolveComplain();
	
	public List<ComplainVO> viewUserPendingComplain(ComplainVO complainVO);
	public List<ComplainVO> viewUserResolveComplain(ComplainVO complainVO);
}
