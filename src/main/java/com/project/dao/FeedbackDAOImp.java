package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.FeedbackVO;

@Repository
public class FeedbackDAOImp implements FeedbackDAO {
	
	@Autowired
	SessionFactory sessionfactory;
	
	public void insertFeedback(FeedbackVO feedbackVO)
	{
		Session s=sessionfactory.getCurrentSession();
		s.saveOrUpdate(feedbackVO);
	}
	
	public List searchFeedback(FeedbackVO feedbackVO)
	{
		Session s=sessionfactory.getCurrentSession();
		Session session = sessionfactory.getCurrentSession();
		Query q = session.createQuery("from FeedbackVO");
		return q.list();
	}
	
	public List searchUserFeedback(FeedbackVO feedbackVO)
	{
		Session s=sessionfactory.getCurrentSession();
		Session session = sessionfactory.getCurrentSession();
		Query q = session.createQuery("from FeedbackVO where loginVO.id='"+feedbackVO.getLoginVO().getId()+"'");
		return q.list();
	}

}
