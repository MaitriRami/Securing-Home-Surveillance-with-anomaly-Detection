package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.PackageDAO;
import com.project.model.PackageVO;

@Service
public class PackageServiceImp implements PackageService {

	@Autowired
	PackageDAO packageDAO;

	@Transactional
	public void insertPackage(PackageVO packageVO) {

		packageDAO.insertPackage(packageVO);
	}

	@Transactional
	public List searchPackage(PackageVO packageVO) {
		return packageDAO.searchPackage(packageVO);

	}

	@Transactional
	public List searchPackageById(PackageVO packageVO) {
		return packageDAO.searchPackageById(packageVO);

	}

}
