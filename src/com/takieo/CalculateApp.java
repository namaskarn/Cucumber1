package com.takieo;

import java.util.Scanner;

public class CalculateApp {

	int fno;
	int sno;
	int result = 0;

	static Scanner sc = new Scanner(System.in);

	void add() {
		System.out.println("Enter the First Number :");
		fno = sc.nextInt();
		System.out.println("Enter the Second Number");
		sno = sc.nextInt();
		result = fno + sno;
		System.out.println("Adding of Two Numbers :" + result);

	}

	void sub() {
		System.out.println("Enter the First Number :");
		fno = sc.nextInt();
		System.out.println("Enter the Second Number");
		sno = sc.nextInt();
		result = fno - sno;
		System.out.println("Substracting of Two Numbers :" + result);

	}

	void mul() {
		System.out.println("Enter the First Number :");
		fno = sc.nextInt();
		System.out.println("Enter the Second Number");
		sno = sc.nextInt();
		result = fno * sno;
		System.out.println("Multipling of Two Numbers :" + result);

	}

	void div() {
		System.out.println("Enter the First Number :");
		fno = sc.nextInt();
		System.out.println("Enter the Second Number");
		sno = sc.nextInt();
		result = fno / sno;
		System.out.println("dividing of Two Numbers :" + result);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculateApp demo = new CalculateApp();

		while(true)

		{
		System.out.println("1 Add");
		System.out.println("2 Sub");
		System.out.println("3 Mul");
		System.out.println("4 Div");
		System.out.println("5 Exit");
System.out.println("Enter the choice");
int choice = sc.nextInt();
switch(choice)
{
case 1:
	demo.add();
	break;
	
case 2:
	demo.sub();
break;

case 3:
	demo.mul();
	break;
case 4:
	demo.div();
	break;
case 5:
	System.out.println("Thanks for using App");
	System.exit(0);
default:
	System.out.println("Choose 1 to 5 between");
	

	
	
}
}
	}// end of while

}
