package com.takieo;

public class Constructor {
	
	int accno;
	String accName;
	
	Constructor(){
	accno=100;
	accName="Saving";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor acc=new Constructor();
System.out.println(acc.accName+"\t"+acc.accno);		
		
	}

}
