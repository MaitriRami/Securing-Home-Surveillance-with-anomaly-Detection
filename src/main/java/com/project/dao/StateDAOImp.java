package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.CityVO;
import com.project.model.StateVO;

@Repository
public class StateDAOImp implements StateDAO{
	
	@Autowired
	SessionFactory sessionfactory;
	
	public void insertState(StateVO stateVO)
	{
		
		Session s=sessionfactory.getCurrentSession();
		s.saveOrUpdate(stateVO);
	}
	
	public List searchState(StateVO stateVO)
	{
		Session session = sessionfactory.getCurrentSession();
		Query q = session.createQuery("from StateVO where status=true");
		return q.list();
	}
	
	
	public List searchStateById(StateVO stateVO)
	{
		Session session = sessionfactory.getCurrentSession();
		Query q = session.createQuery("from StateVO where id='" + stateVO.getId() + "'");
		return q.list();
	}
	
	public List searchStateByCountryId(StateVO stateVO) {

		Session session = sessionfactory.openSession();
		Query q = session.createQuery("from StateVO where countryVO='" +stateVO.getCountryVO().getId()+ "'");
		return q.list();
	

	}


}
