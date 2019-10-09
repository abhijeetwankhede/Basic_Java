package com.trmapp.main;

import com.trmapp.domain.TrainingRequest;
import com.trmapp.service.TrainingRequestService;
import com.trmapp.serviceimpl.TrainingRequestServiceImpl;

public class ApplicationRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainingRequest[] trainer;
		
		TrainingRequestService service=new TrainingRequestServiceImpl();
		service.saveRequest();
		service.listRequest();
		
	}

}
