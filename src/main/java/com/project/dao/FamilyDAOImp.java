package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.FamilyPhotoVO;

@Repository
public class FamilyDAOImp implements FamilyDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void insertFamilyPhoto(FamilyPhotoVO familyPhotoVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(familyPhotoVO);
	}
	
	/*public void insertMultiplePhoto(PhotoVO photoVO) {
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(photoVO);
	}*/

	/*public void insertFamily(FamilyVO familyVO) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(familyVO);
	}*/

	public List viewFamilyPhoto(FamilyPhotoVO familyPhotoVO) {

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from FamilyPhotoVO where status=true AND loginVO='" + familyPhotoVO.getLoginVO().getId() + "'");
		return query.list();

	}

	/*public List searchFamilyById(FamilyVO familyVO) {

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from FamilyVO where loginVO.id=" + familyVO.getLoginVO().getId());
		return query.list();
	}
	*/

	public List searchPhotoById(FamilyPhotoVO familyPhotoVO) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from FamilyPhotoVO where id='" + familyPhotoVO.getId() + "'");
		return query.list();
	}

}
