package com.basic;

public class ObjectExample {

	int arg;
	String count;
	public  ObjectExample () {
		
	}
	@Override
	public String toString() {
		
		return arg+" "+count;
	}
	public  ObjectExample (int arg,String count) {
		this.arg=arg;
		this.count=count;
		
		
		
	}
	
	public static void main(String[] args) {
		ObjectExample objectone=new ObjectExample (5000,"good");
		System.out.println(objectone);
		System.out.println(objectone.hashCode());
		objectone.getClass();
		System.out.println(objectone);
	}
	
}
