package com.takieo;

public class Boolean {
	
	public void foo(boolean a, boolean b)
	{
		if(a)
		{
			System.out.println("A");
		}
		else if(a&&b)
		{
			System.out.println("A&&B");
		}
		else
		{
		if(!b)	
		{
			System.out.println("notB");
		}
		else {
			System.out.println("ELSE");
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Boolean boo= new Boolean();
boo.foo(false, true);
	}

}
