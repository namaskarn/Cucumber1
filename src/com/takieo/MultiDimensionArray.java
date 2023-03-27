package com.takieo;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int ar[][]= new int [3][3];
	
	System.out.println(ar[0][0]);
	System.out.println(ar[0][1]);
	System.out.println(ar[0][2]);
	
	System.out.println(ar[1][0]);
	System.out.println(ar[1][1]);
	System.out.println(ar[1][2]);
	
	System.out.println(ar[2][0]);
	System.out.println(ar[2][1]);
	System.out.println(ar[2][2]);
	
for(int i=0;i<ar.length;i++)
{
	for(int j=0;j<ar.length;j++)
	{
	System.out.print(ar[i][j]+" ");	
	}

System.out.println();
	}
	}
}
