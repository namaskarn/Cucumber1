package com.takieo;

public class Studentt {
	
	int sno;
	String sname;
	double sal;
	String add;
	
	void display(int sno,String sname,double sal,String add)
	{
	System.out.println(sno+"\t"+sname+"\t"+sal+"\t"+add);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Studentt stu= new Studentt();
//System.out.println(stu.sno+"\t"+stu.sname+"\t"+stu.sal+"\t"+stu.add);

new Studentt().display(100,"shiva",250.25,"hyd");

//System.out.println(stu.sno+"\t"+stu.sname+"\t"+stu.sal+"\t"+stu.add);
	}

}
