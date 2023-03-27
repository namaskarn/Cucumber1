package com.takieo;

public class ConstructorEx {
	
	int eno;
	String ename;
	
	public ConstructorEx(int eno, String ename) {
	this.eno=eno;
	this.ename=ename;
	
	}
	void display()
	{
		System.out.println(eno+"\t"+ename);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx con= new ConstructorEx(100,"shiva");
		ConstructorEx con1= new ConstructorEx(200,"rani");
		
con.display();
con1.display();
	}

}
