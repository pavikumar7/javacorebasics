package com.basic;

public class MaxAndMin {
	public static void main(String arg[]) {
		int array[] =new int[] { 55,10,40,2,36};
		int max=array[0];
		int min= array[0];
		for (int i=1 ;i<array.length;i++) { 
			if(array[i]>max) {
				max=array[i];
			}
			
			if(array[i]<min) {
				max=array[i];
		}
		
		
	}

	System.out.println("maximum value is :"+max);	
	System.out.println("minimum value is :"+min);		
		
		
}
}