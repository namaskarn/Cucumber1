package com.takieo;

import java.util.Scanner;

public class ArrayDemo1 {

	String str[]=new String[3];
	int ar[]= {100,800,200,900,300};//Annomous Array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayDemo1 demo = new ArrayDemo1();
	for(int i : demo.ar)
	{
		System.out.println(i);
	}
	
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<demo.str.length;++i)
	{
		System.out.println("Enter the name");
		String name= sc.next();
	demo.str[i]=name;
	
	}
System.out.println("Display Name :");

for(String s: demo.str)
{
	System.out.println(s);
}
	}

}
