package com.trmapp.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.trmapp.dao.TrainingRequestDAO;
import com.trmapp.daoimpl.TraningRequestDAOImp;
import com.trmapp.domain.TrainingRequest;
import com.trmapp.service.TrainingRequestService;
/**
 * This TrainingRequestServiceImpl class represent implementation of training request
 */
public class TrainingRequestServiceImpl implements TrainingRequestService {

	TrainingRequest[] trainer;
	TraningRequestDAOImp trainingDAORequest=new TraningRequestDAOImp() ;
		
		@Override
		public void saveRequest() {
			// TODO Auto-generated method stub
	
			trainingDAORequest.save(trainer);
		}
	


	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public TrainingRequest[] listRequest() {
		// TODO Auto-generated method stub
		return trainingDAORequest.list(trainer);
	}



	

}
