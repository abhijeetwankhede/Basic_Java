package com.trmapp.dao;

import com.trmapp.domain.TrainingRequest;

/**
 * TrainingRequestDAO interface show the CRUD operation to training request.
 */
public interface TrainingRequestDAO {

	/**
	 *Save() method is used for to save training Requests. 
	 */
	public TrainingRequest[] save(TrainingRequest[] trainer);
	
	/**
	 * 
	 * 
	 */
	public TrainingRequest[] list(TrainingRequest[] trainer);
	
	
}
