package com.takieo;

public class Sdemo5 {
	
	int x;
	static int y;
	void functionA()
	{
		int y=0;
		System.out.println("inside non static method,functionA()");
		x=10;
		y=30;
		
		System.out.println(x);
		System.out.println(y);
		functionZ();
		System.out.println(x);
		System.out.println(y);
		
	}
	static void functionZ() {
		System.out.println("inside non static method functionZ()");
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sdemo5 s= new Sdemo5();
		s.functionA();
		

	}

}
