package com.trmapp.daoimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.trmapp.dao.TrainingRequestDAO;
import com.trmapp.domain.TrainingRequest;

public class TraningRequestDAOImp implements TrainingRequestDAO{

	TrainingRequest trainingRequest;
	TrainingRequest trainingRequest1;
	@Override
	public TrainingRequest[] save(TrainingRequest[] trainer) {
		// TODO Auto-generated method stub
		 trainingRequest=new TrainingRequest();
		
		trainingRequest.setId(101);
		trainingRequest.setName("java");
		trainingRequest.setJoin_date(new Date());
		trainingRequest.setEnd_date(new Date());
		
		//System.out.println(counter);
		System.out.println("saved");
		
		trainingRequest1=new TrainingRequest();
		
		trainingRequest1.setId(102);
		trainingRequest1.setName("DotNet");
		trainingRequest1.setJoin_date(new Date());
		trainingRequest1.setEnd_date(new Date());
		
		System.out.println("saved");
		return trainer;
		
		
			}

	@Override
	public TrainingRequest[] list(TrainingRequest[] trainer) {
		
		for (TrainingRequest trainingRequest : trainer) {
			System.out.println(trainingRequest.getId());
		}
		
		return trainer;
		
	}
	


}
