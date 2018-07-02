package com.basic;

public class Encoding {
	public static void findOriginalFirstAndSum(int[] input1) {
		
		for(int i=0;i<=input1.length;i++) {
			for(int j=0;j<=input1.length;j++)	{
				input1[i]=input1[i+1]-input1[i];
				System.out.println("encode array"+input1[i]);
				
			}
		}
		int c=input1[0];
		System.out.println("first num"+c);
		for(int i=0;i<=input1.length;i++) {
		int sum=0;
		sum=sum+input1[i];
		System.out.println("sum"+sum);
		
				
	}

}}
