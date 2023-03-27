package com.takieo;

public class Employee {
	
	//non static variable
	int eno;
	String ename;
	double sal;
	boolean flag;
	long mobileNumber;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		{
		System.out.println(emp.eno+"\t"+emp.ename+"\t"+emp.sal+"\t"+emp.flag);
		}
		emp.eno = 100;
		emp.ename ="rani";
		{
		System.out.println(emp.eno+"\t"+emp.ename+"\t"+emp.sal+"\t"+emp.flag);
		}
	}

}
