package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.FeedbackDAO;
import com.project.model.FeedbackVO;

@Service
public class FeedbackServiceImp implements FeedbackService {

	@Autowired
	FeedbackDAO feedbackDAO;

	@Transactional
	public void insertFeedback(FeedbackVO feedbackVO) {
		feedbackDAO.insertFeedback(feedbackVO);
	}

	@Transactional
	public List searchFeedback(FeedbackVO feedbackVO) {
		return feedbackDAO.searchFeedback(feedbackVO);
	}

	@Transactional
	public List searchUserFeedback(FeedbackVO feedbackVO) {
		return feedbackDAO.searchUserFeedback(feedbackVO);
	}

}
