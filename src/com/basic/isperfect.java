package com.basic;

public class isperfect{
    public static void  main(String b[])
    {
    	
    	isperfect m1=new isperfect();
    	System.out.println(m1.number(5));
    }
    public  boolean number(int number)
    {
    	int sum = 0;
    for(int i=1;i<=number/2;i++) {
    	if(number%i==0)
    	{
    		sum=sum+i;
    	}
    }
    if(sum==number)
    {
    	return true;
    }
    else {
    	return false;
    }
}
}