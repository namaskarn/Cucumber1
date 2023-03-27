package com.takieo;

import java.util.Scanner;

public class MultiDimensionArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[][]= new int [3][3];
		Scanner sc =new Scanner(System.in);
		
	System.out.println("Read the data from the console :");
	for(int i=0;i<ar.length;i++)
	{
		for(int j=0;j<3;j++)
		{
		System.out.println("Enter the Number");	
		ar[i][j]=sc.nextInt();
			}
	}


System.out.println("Display Array Elements :");
for(int i=0;i<ar.length;i++)
{
	for(int j=0;j<3;j++)
	{
	System.out.print(ar[i][j]+" ");	
	
		}
	System.out.println();
	}
	}
}
