package com.basic;

public class RevNum {
	public static void main(String arg[])
	{
		int num=8694,temp=0;
		while(num!=0) {
			temp=temp*10;
			temp=temp+(num%10);
			num=num/10;
			
		}
		System.out.println("Revesed Number:"+temp);
	}
	
}
