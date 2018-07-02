package com.basic;

public class AutoBoxing {
	public static void main(String n[]) {
		Integer  v1=new Integer(52);
		v1++;
      int p=v1+20;
		System.out.println(p);
		getData(10,new Taxi(),new Train());
	}
	private static void getData(int i, Taxi taxi, Train train) {
		// TODO Auto-generated method stub
		
	}
	public static void getData(int Count,Car... car) {
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
	}
	

}
