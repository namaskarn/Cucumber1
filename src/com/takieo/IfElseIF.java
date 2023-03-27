package com.takieo;

import java.util.Scanner;

public class IfElseIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Marks");
	
	int marks = sc.nextInt();
	
	if(marks>=90)
	{
		System.out.println("A Grade");
	}
	else if(marks<90&&marks>=80)
	{
		System.out.println("B Grade");
		
	}
	else if(marks<80&&marks>=50)
	{
		System.out.println("C Grade");
		
	}
	else if(marks<50&&marks>=40)
	{
		System.out.println("D Grade");
		
	}
	else
	{
		System.out.println("Try for next semester!");
	}

	}

}
