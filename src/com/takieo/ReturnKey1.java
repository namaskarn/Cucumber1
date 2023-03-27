package com.takieo;

public class ReturnKey1 {
	
	int fun(int fno,int sno)
	{
		System.out.println(fno+sno);
	
		return fno+sno;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnKey1 demo = new ReturnKey1();
		int result =demo.fun(100,25);
		
	System.out.println("Adding of two numbers:"+result);

	}

}
