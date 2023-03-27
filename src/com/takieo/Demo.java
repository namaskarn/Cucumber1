package com.takieo;

public class Demo {
	
	int x=100;
	static int y=200;
	static Demo d=null;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo.d=null;
System.out.println(d.y);
System.out.println(d.d);
d.y=500;
y=1000;

System.out.println(d.y);


	}

}
