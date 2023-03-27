package com.takieo;

public class ThisDemo {
	int sno;
	String sname;
	
	void display(int sno,String sname)
	{
		this.sno=sno;
		this.sname=sname;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisDemo demo= new ThisDemo();
System.out.println(demo.sno+"\t"+demo.sname);
demo.display(100, "rani");
System.out.println(demo.sno+"\t"+demo.sname);
	}

}
