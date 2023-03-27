package com.takieo;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[][]=new int[3][];
		ar[0]=new int[3];
		ar[1]=new int[2];
		ar[2]=new int[1];
		
		for(int i=0  ; i<ar.length;i++)
		{
			for(int j=0; j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
		}
		

	}

}
