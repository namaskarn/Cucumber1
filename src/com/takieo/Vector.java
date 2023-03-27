package com.takieo;

import java.util.Collections;
import java.util.Vector;
public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer>al=new Vector<>;
		
		
	al.add(100);
	al.add(250);
	al.add(125);
	al.add(100);
	al.add(200);
	System.out.println(al);
	
	al.addElement(500);
	System.out.println(al.size());//6
	System.out.println(al.capacity());//10
	
	Collections.sort(al);
	System.out.pritnln(al);
	
		

	}

}
