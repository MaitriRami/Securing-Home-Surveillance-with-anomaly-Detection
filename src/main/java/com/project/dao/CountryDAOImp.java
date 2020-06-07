package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.CountryVO;

@Repository
public class CountryDAOImp implements CountryDAO {

	@Autowired
	SessionFactory sessionfactory;

	public void insertCountry(CountryVO countryVO) {

		Session s = sessionfactory.getCurrentSession();
		s.saveOrUpdate(countryVO);
	}

	public List searchCountry(CountryVO countryVO) {
		Session s = sessionfactory.getCurrentSession();
		Query q = s.createQuery("from CountryVO where status=true");
		return q.list();

	}

	public List searchCountryById(CountryVO countryVO) {
		Session session = sessionfactory.getCurrentSession();
		Query q = session.createQuery("from CountryVO where id='" + countryVO.getId() + "'");
		return q.list();

	}

}
