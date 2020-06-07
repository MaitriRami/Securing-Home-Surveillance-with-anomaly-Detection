package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.DatasetDAO;
import com.project.model.DatasetVO;

@Service
public class DatasetServiceImp implements DatasetService {

	@Autowired
	DatasetDAO datasetDAO;

	@Transactional
	public void insertDataset(DatasetVO datasetVO) {
		datasetDAO.insertDataset(datasetVO);
	}

	@Transactional
	public List serachDataset(DatasetVO datasetVO) {
		return datasetDAO.serachDataset(datasetVO);
	}

	public List searchDatasetById(DatasetVO datasetVO) {
		return datasetDAO.searchDatasetById(datasetVO);
	}

}
