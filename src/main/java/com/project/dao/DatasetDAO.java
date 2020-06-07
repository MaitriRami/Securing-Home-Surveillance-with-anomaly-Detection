package com.project.dao;

import java.util.List;

import com.project.model.DatasetVO;

public interface DatasetDAO {
	
	public void insertDataset(DatasetVO datasetVO);
	public List serachDataset(DatasetVO datasetVO);
	public List searchDatasetById(DatasetVO datasetVO);

}
