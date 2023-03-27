package com.takieo;

import java.util.Scanner;

public class EvenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = sc.nextInt();
	if(num%2==0)
		System.out.println("Given number is even number");
	else
		System.out.println("Given number is not a even number");

	}

}
