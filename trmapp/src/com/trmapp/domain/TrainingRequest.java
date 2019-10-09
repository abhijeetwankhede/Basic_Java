package com.trmapp.domain;

import java.util.Date;
/**
 * This class represent training request.
 */
public class TrainingRequest {

	private static int counter;
	TrainingRequest[] trainer;
	
	public TrainingRequest() {
		// TODO Auto-generated constructor stub
		trainer=new TrainingRequest[10];
		System.out.println("object created");
		counter++;
		System.out.println(counter);
	}
	
	/**
	 * id represent the trainer id
	 */
	private int id;
	/*
	 * name is represent trainer name
	 * */
	private String name;
	/*
	 * join_date represent trainer joining date
	 * */
	private Date join_date;
	/*
	 * end_date represent trainer end date
	 * */
	private Date end_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	
	
	
	
}
