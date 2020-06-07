package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.CityVO;
import com.project.model.StateVO;

@Repository
public class CityDAOImp implements CityDAO{
	
	@Autowired
	SessionFactory sessionfactory;
	
	public void insertCity(CityVO cityVO)
	{
		
		Session s=sessionfactory.getCurrentSession();
		s.saveOrUpdate(cityVO);
	}
	
	public List searchCity(CityVO cityVO)
	{
		Session session = sessionfactory.getCurrentSession();
		Query q = session.createQuery("from CityVO where status=true");
		return q.list();
	}
	
	
	public List searchCityById(CityVO cityVO)
	{
		Session session = sessionfactory.getCurrentSession();
		Query q = session.createQuery("from CityVO where id='" + cityVO.getId() + "'");
		return  q.list();
	
	}
	
	public List searchCityByStateId(CityVO cityVO) {

		Session session = sessionfactory.openSession();
		Query q = session.createQuery("from CityVO where  stateVO='" +cityVO.getStateVO().getId()+ "'");
		return q.list();
	

	}

	
		
	

}
