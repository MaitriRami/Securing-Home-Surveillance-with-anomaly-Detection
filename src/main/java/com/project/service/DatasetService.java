package com.project.service;

import java.util.List;

import com.project.model.DatasetVO;

public interface DatasetService {
	
	
	public void insertDataset(DatasetVO datasetVO);
	public List serachDataset(DatasetVO datasetVO);
	public List searchDatasetById(DatasetVO datasetVO);

}
