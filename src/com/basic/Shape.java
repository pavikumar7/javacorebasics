package com.basic;

public class Shape {

	double side;
	double length;
	double breadth;
	public Shape(double side) {
		this.side=side;
		
	}
	public Shape(double length,double breadth) {
		
		if(length>0.0 && length<20. && breadth>0.0 &&  breadth<20.0) {
		
	this.length=length;
	this.breadth=breadth;
		}else {
			System.out.println("values of length greater than 0.0 and less than 20.0");
		}
	}
	public double FindAreaofReactangle() {
		return length*breadth;
	}
	public double FindAreaofSquare() {
		return side*side;
	}
	
	public static void main(String b[]) {
		Shape s1=new Shape(10);
		Shape s2=new Shape(5,8);
		System.out.println(s2.FindAreaofReactangle());
		System.out.println(s1.FindAreaofSquare());
	}
}
	
	
	
		
			
		
	

