package com.project.service;

import java.util.List;

import com.project.model.ComplainVO;

public interface ComplainService {
	
	public void insertComplain(ComplainVO complainVO);
	public List searchComplain(ComplainVO complainVO);
	public List searchComplainById(ComplainVO complainVO);
	public List displayComplain(ComplainVO complainVO);
	public List<ComplainVO> viewPendingComplain();
	public List<ComplainVO> viewResolveComplain();
	public List<ComplainVO> viewUserPendingComplain(ComplainVO complainVO);
	public List<ComplainVO> viewUserResolveComplain(ComplainVO complainVO);

}
