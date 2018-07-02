package com.basic;

import java.util.Scanner;

public class MaxTwoNumbers {
	public void number(int[]  num){
		  int val1=0;
		  int val2=0;
		  
		  for(int n:num){
			  
		    if(n>val1){
			  
	        val2=val1;
		    val1=n;
		    }
		    else if(n>val2){
			  val2=n;
		    }
		    }
		  System.out.println(val1+" " +val2);
		    
		}

		  
		  public static void main(String args[]){
		     
		    //int num[]={15,78,-2,45,11,-9,23};
		    
	        Scanner sc =new Scanner(System.in);
			
			int num=sc.nextInt();
			int arr[]=new  int[num];
			
			
			
			for(int i=0;i<num;i++){
				
	        arr[i]=sc.nextInt();
	      	}	
		    MaxTwoNumbers n1=new MaxTwoNumbers();
			n1.number(arr);
			
		  }
	}

