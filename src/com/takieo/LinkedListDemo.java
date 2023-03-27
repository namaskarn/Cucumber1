package com.takieo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList al= new LinkedList();
		
		al.add(100);
		al.add("shiva");
		al.add(250.25);
		al.add(100);
		al.add(null);
		
		System.out.println(al);
		
		al.addFirst(600);
		al.addLast(900);
		System.out.println(al);
		
	}

}
