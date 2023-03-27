package com.takieo;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employe emp = new Employe(100,"Shiva","hyd");
		Employe emp1 = new Employe(50,"Shiva","hyd");
		Employe emp2 = new Employe(30,"Shiva","hyd");
		Employe emp3 = new Employe(20,"Shiva","hyd");
		Employe emp4 = new Employe(10,"Shiva","hyd");
		
		TreeSet<Employe>tr=new TreeSet<>();
		
		
		tr.add(emp);
		tr.add(emp1);
		tr.add(emp2);
		tr.add(emp3);
		tr.add(emp4);
		System.out.println(tr);
		
		for(Employe employe :tr)
		{
			System.out.println(employe.getEno()+"\t"+employe.getEname()+"/"+employe.getEadd());
		}

	}

}
