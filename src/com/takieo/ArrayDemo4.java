package com.takieo;

import java.util.Arrays;

public class ArrayDemo4 {
	static void min(int ar[])
	{
		int min=ar[0];
		for(int i=0;i<ar.length;++i)
		{
			if (ar[i]<min)// this i is index value and > this is for swapping purpose
				min=ar[i];

		}
	
	
System.out.println("Min Element :"+min);
	}
public static int getSecondLargest(int ar[])
	{
	/*	int temp;
		for(int i=0;i<ar.length;++i)
		{
			for(int j=i+1;j<7;++j)
			{
				if (ar[i]>ar[j])
				{
					temp= ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				}
			*/			
			//}
	Arrays.sort(ar);
		return ar[ar.length-2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int ar[]= {2,8,9,1,3,4,25};

		min(ar);
		System.out.println("Get Second Largest :"+getSecondLargest(ar));
		System.out.println("Before shorting :");
		for(int i:ar)
			System.out.println(i);
		Arrays.sort(ar);
		System.out.println("Array sorting");
		for(int i:ar)
			System.out.println(i);
		
		
		

	}

}
