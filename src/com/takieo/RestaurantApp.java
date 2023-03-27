package com.takieo;

import java.util.Scanner;

public class RestaurantApp {
	
	static void bill()
	{
		System.out.println("****************");
		System.out.println("Biryani Bill: "+BiryaniDetails.biryani_total);
		System.out.println("****************");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true)

		{
		System.out.println("**************");
		System.out.println("  1)Biryani   ");
		System.out.println("  2)Bill      ");
		System.out.println("  3)Exit      ");
		System.out.println("**************");
		
System.out.println("Enter the choice");
int choice = sc.nextInt();

switch(choice)
{
case 1:
	BiryaniDetails details=new BiryaniDetails();
	details.biryaniMenu();
	break;
case 2:
	bill();
	break;
case 3:
	System.out.println("thanks for using App");
	System.exit(0);
	
default:
	System.out.println("Choose 1 to 3");
	}//end of switch
		}//end of while
		
	}
}
