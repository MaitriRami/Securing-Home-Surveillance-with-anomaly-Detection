package com.project.dao;

import java.util.List;

import com.project.model.FeedbackVO;

public interface FeedbackDAO {
	
	public void insertFeedback(FeedbackVO feedbackVO);
	public List searchFeedback(FeedbackVO feedbackVO);
	public List searchUserFeedback(FeedbackVO feedbackVO);


}
