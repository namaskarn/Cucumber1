package com.takieo;

public class SwapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fno=100;int sno=200;
		System.out.print("Before Swapping");
		System.out.println("Fno: "+fno+"Sno :"+sno);
		
	//swapping
		
		int temp = 0;
		temp = fno;
		fno =sno;
		sno= temp;
		
	System.out.println("After Swapping");
	System.out.println("Fno :"+fno+"sno:"+sno);
	

	}

}
