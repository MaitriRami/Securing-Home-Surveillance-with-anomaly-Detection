package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.PackageVO;

@Repository
public class PackageDAOImp implements PackageDAO {

	@Autowired
	SessionFactory sessionfactory;

	public void insertPackage(PackageVO packageVO) {

		Session s = sessionfactory.getCurrentSession();
		s.saveOrUpdate(packageVO);
	}

	public List searchPackage(PackageVO packageVO) {
		Session session = sessionfactory.getCurrentSession();
		Query q = session.createQuery("from PackageVO where status=true");
		return q.list();

	}

	public List searchPackageById(PackageVO packageVO) {
		Session session = sessionfactory.getCurrentSession();
		Query q = session.createQuery("from PackageVO where id='" + packageVO.getId() + "'");
		return q.list();

	}

}
