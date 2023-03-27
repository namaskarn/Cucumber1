package com.takieo;

public class Account {
	
	int accNo=10;
	String accName;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Account acc= new Account();
	Account acc1= new Account();
	
	acc.accName = "savingaccount";
	{
	System.out.println(acc.accName+"\t"+acc1.accName);
	}
System.out.println(acc);
	}

}
