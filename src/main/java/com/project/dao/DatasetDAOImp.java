package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.CountryVO;
import com.project.model.DatasetVO;

@Repository
public class DatasetDAOImp implements DatasetDAO {

	@Autowired
	SessionFactory sessionfactory;

	public void insertDataset(DatasetVO datasetVO) {

		Session s = sessionfactory.getCurrentSession();
		s.saveOrUpdate(datasetVO);
	}

	public List serachDataset(DatasetVO datasetVO) {
		Session session = sessionfactory.openSession();
		Query q = session.createQuery("from DatasetVO where status=true");
		return q.list();
	}

	public List searchDatasetById(DatasetVO datasetVO) {
		Session session = sessionfactory.openSession();
		Query q = session.createQuery("from DatasetVO where id='" + datasetVO.getId() + "'");
		return q.list();
	}

}
