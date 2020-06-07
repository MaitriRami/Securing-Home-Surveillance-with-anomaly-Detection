package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.FamilyDAO;
import com.project.model.FamilyPhotoVO;

@Service
public class FamilyServiceImp implements FamilyService {

	@Autowired
	FamilyDAO familyDAO;

	@Transactional
	public void insertFamilyPhoto(FamilyPhotoVO familyPhotoVO)
	{
		familyDAO.insertFamilyPhoto(familyPhotoVO);
	}
	
	/*@Transactional
	public void insertFamily(FamilyVO familyVO) {
		familyDAO.insertFamily(familyVO);
	}

	@Transactional
	public void insertMultiplePhoto(PhotoVO photoVO) {
		familyDAO.insertMultiplePhoto(photoVO);
	}

*/	@Transactional
	public List viewFamilyPhoto(FamilyPhotoVO familyPhotoVO) {
		return familyDAO.viewFamilyPhoto(familyPhotoVO);
	}

/*	@Transactional
	public List searchFamilyById(FamilyVO familyVO) {

		return familyDAO.searchFamilyById(familyVO);

	}*/

	@Transactional
	public List searchPhotoById(FamilyPhotoVO familyPhotoVO) {
		return familyDAO.searchPhotoById(familyPhotoVO);

	}

}
