package com.trmapp.service;

import com.trmapp.domain.TrainingRequest;

/**
 * TrainingRequestService represent CRUD operation related to training request.
 */
public interface TrainingRequestService {
	
	/**
	 * This method show save the trainer request
	 */
	public void saveRequest();
	/**
	 * This method show list of trainer request
	 */
	public TrainingRequest[] listRequest();
	/**
	 * This method represent delete the request by id
	 */
	public int delete(int id);
	
	/**
	 * 
	 */

}
