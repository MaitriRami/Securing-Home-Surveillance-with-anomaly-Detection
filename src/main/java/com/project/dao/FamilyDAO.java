package com.project.dao;

import java.util.List;

import com.project.model.FamilyPhotoVO;

public interface FamilyDAO {

	/*public void insertFamily(FamilyVO familyVO);

	public void insertMultiplePhoto(PhotoVO photoVO);
*/	
	public List viewFamilyPhoto(FamilyPhotoVO familyPhotoVO);
	
/*	public List searchFamilyById(FamilyVO familyVO);*/
	
	public List searchPhotoById(FamilyPhotoVO familyPhotoVO);
	
	public void insertFamilyPhoto(FamilyPhotoVO familyPhotoVO);

}
