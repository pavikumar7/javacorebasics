package com.basic;

public class PassByCopy {
	public static void main(String arg[]) {
		
	Value obj=new Value();
	int d=obj.C(10, 12);
	System.out.println(d);
			
		
	}
}

	class Value{
		public static int C(int a,int b) {
			int C=a+b;
			return(C);
		}
	}
	
	


