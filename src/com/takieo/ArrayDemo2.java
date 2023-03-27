package com.takieo;

public class ArrayDemo2 {

	static void max(int arr[])//all array store here
	{
		int max=arr[0];//max is one variable
		for(int i=0;i<arr.length;++i)
		{
			if (arr[i]>max)// this i is index value and > this is for swapping purpose
				max=arr[i];
		}
		System.out.println("Largest Element:"+max);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int ar[]= {2,8,9,1,3,4,25};//we setup array elements
	max(ar); //we are passing annomus array here
	
	
		
	}

}
