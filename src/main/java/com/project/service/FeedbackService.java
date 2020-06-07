package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.model.FeedbackVO;

public interface FeedbackService {

	
	public void insertFeedback(FeedbackVO feedbackVO);
	public List searchFeedback(FeedbackVO feedbackVO);
	public List searchUserFeedback(FeedbackVO feedbackVO);


}
