package com.basic;

public class Train {

	String model;
	double speed;
	public void getspeed() {
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public static void main(String arg[]) {
		Train train=new Train();
		train.setModel("passengers");
		train.setSpeed(100);
		train.getSpeed();
		train.getModel();
		System.out.println(train.getSpeed());
		System.out.println(train.getModel());
	
	}
	

	
	
	
	
	
	
	
}




