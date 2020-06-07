package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GraphDAOImp implements GraphDAO{

	@Autowired
	SessionFactory sessionfactory;
	
	public List viewPersonCount()
	{
		Session s = sessionfactory.getCurrentSession();
		Query q = s.createSQLQuery("SELECT COUNT(id),personDetectionDate FROM `unkownperson_master` GROUP BY personDetectionDate");
		return q.list();	
	}
	
}
