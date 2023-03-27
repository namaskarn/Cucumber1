package com.takieo;

import java.util.HashSet;
import java.util.Scanner;

public class Employe implements Comparable<Employe> {
	private int eno;
	private String ename;
	private String eadd;
	public Employe(int eno, String ename, String eadd) {
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
	@Override
	public int compareTo(Employe emp) {
		// TODO Auto-generated method stub
		if (eno<emp.getEno())
			return -1;
		else if (eno>emp.getEno())
			return +1;
		else
		return 0;
	}
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Employe>hs =new HashSet<>();
		
		
		hs.add(new Employe(100,"shiva","hyd"));
		hs.add(new Employe(101,"lilly","hyd"));
		hs.add(new Employe(105,"rani","hyd"));
		hs.add(new Employe(104,"malli","hyd"));
		hs.add(new Employe(103,"manasa","hyd"));
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Employe Number");
		int eno=sc.nextInt();
		
		int k=0;
		for(Employe emp:hs)
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


