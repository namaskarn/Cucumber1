package com.takieo;

public class StaticDemo {
	
	static int fno =100;
	
	static void display()
	{
		System.out.println("Static Method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Directly :"+fno);
display();

System.out.println("usingClassName :"+StaticDemo.fno);
StaticDemo.display();

StaticDemo demo = new StaticDemo();
System.out.println("usingReferenceVariable :"+demo.fno);
demo.display();

StaticDemo demo1 =null;
System.out.println("usingReferenceVariable: "+demo1.fno);
demo1.display();


	}

}
