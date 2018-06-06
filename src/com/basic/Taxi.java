package com.basic;

public class Taxi  extends Car{
	
		public Taxi() {
			System.out.println("Taxi empty cons");
		}
		
		
		@Override
		public void brake() {
		
		//super.brake();
		System.out.println("brake in taxi");
		}
public static void main(String arg[])
{
   
   Taxi t1=new Taxi();
   t1.setSpeed(10);
   t1.brake();                                              
   System.out.println("empty constructor");
   Car car1=new Car();
	Car car2=new Car();
	car1.speed=20.0;
	car2.speed=30.0;
	
	System.out.println(car1.speed);
	System.out.println(car2.speed);

}





	

}
