package com.takieo;

import java.util.HashSet;
import java.util.Scanner;

	class Employ{


	private int eno;
	private String ename;
	private String eadd;
	public Employ(int eno, String ename, String eadd) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.eadd = eadd;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public int compareTo(Employ o ) {
		// TODO Auto-generated method stub
		
	}
	
}

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Employ>hs =new HashSet<>();
		
		
		hs.add(new Employ(100,"shiva","hyd"));
		hs.add(new Employ(101,"lilly","hyd"));
		hs.add(new Employ(105,"rani","hyd"));
		hs.add(new Employ(104,"malli","hyd"));
		hs.add(new Employ(103,"manasa","hyd"));
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Employee Number");
		int eno=sc.nextInt();
		
		int k=0;
		for(Employ emp:hs)
		{
			if(emp.getEno()==eno)
			{
				++k;
				System.out.println(emp.getEno()+"\t"+emp.getEname()+"\t"+emp.getEadd());
				break;
				
			}
		}
		
		if(k==0)
		System.out.println("Given Number is not Exist");
		
		
	}

}
