package com.project.service;

import java.util.List;

import com.project.model.PackageVO;

public interface PackageService {
	
	public void insertPackage(PackageVO packageVO);
	public List searchPackage(PackageVO packageVO);
	public List searchPackageById(PackageVO packageVO);

}