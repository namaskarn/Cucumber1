package com.takieo;
@FunctionalInterface
public interface IAddition {
	int add(int fno,int sno);

public static void Main (String[]args)
{
//IAddition ia=(fno,sno)->{System.out.println("Adding of two numbers"+(fno+sno));};
//ia.add(100,300);
// or	
	
//	IAddition ia=(int fno, int sno)->(fno+sno);
//	System.out.println(ia.add(100, 200));

	// or
	
	IAddition ia=(int fno, int sno)->{
		return(fno+sno);
	
};
System.out.println(ia.add(100, 200));
}
}