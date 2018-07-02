package com.basic;

public class ArrayCopy {
public static void main(String b[])
{
	int one[]= {10,20,30,40};
	int two[]=new int[one.length];
	
for(int i=0;i<one.length;i++) {
	two[i]=one[i];
}
   System.arraycopy(one,0,two,0,one.length);
}
}