package com.takieo;

public class Product {
	
	int pid;
	String pname;
	
	void display()
	{
		int pid =100;
		String pname="tv";
		{
		System.out.println(pid+"\t"+pname);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product pro = new Product();
System.out.println(pro.pid+"\t"+pro.pname);
pro.display();


	}

}
