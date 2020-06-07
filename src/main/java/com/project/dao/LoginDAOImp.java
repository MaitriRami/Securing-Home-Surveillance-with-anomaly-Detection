package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.CityVO;
import com.project.model.LoginVO;
import com.project.model.RegisterVO;

@Repository
public class LoginDAOImp implements LoginDAO {

	@Autowired
	SessionFactory sessionfactory;

	public void setSessionFactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	public void insertUser(LoginVO loginVO) {

		Session s = sessionfactory.getCurrentSession();
		s.saveOrUpdate(loginVO);
	}

	public List searchById(LoginVO loginVO) {
		Session session = sessionfactory.getCurrentSession();
		Query q = session.createQuery("from LoginVO  where userName='" + loginVO.getUsername() + "' ");
		return q.list();
	}
	
	
}
