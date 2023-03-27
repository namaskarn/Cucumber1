package com.takieo;

public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc=new Account();
		acc.accNo=100;
		acc.accName="Saving";
		
		Account acc1= new Account();
		acc1.accNo=acc.accNo;
		acc1.accName=acc.accName;
		{
			System.out.println(acc1.accName+"\t"+acc1.accNo);
		}
		
	}

}
