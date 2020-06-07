package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.CityVO;
import com.project.model.RegisterVO;

@Repository
public class RegisterDAOImp implements RegisterDAO {
	
	@Autowired
	SessionFactory sessionfactory;
	
	public void insertUser(RegisterVO registerVO)
	{
		
		Session s=sessionfactory.getCurrentSession();
		s.saveOrUpdate(registerVO);
	}
	
	public List searchUser(RegisterVO registerVO)
	{
		Session session = sessionfactory.getCurrentSession();
		Query q = session.createQuery("from RegisterVO where status=true");
		return q.list();
	
	}
	
	public List searchProfileById(RegisterVO registerVO)
	{
		Session session = sessionfactory.getCurrentSession();
		Query q = session.createQuery("from RegisterVO where  loginVO='"+registerVO.getLoginVO().getId()+"'");
		return  q.list();
	
	}
	
	
	
}
