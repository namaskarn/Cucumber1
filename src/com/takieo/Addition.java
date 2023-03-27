package com.takieo;

public class Addition implements IAddition{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		IAddition ia=(int fno, int sno)->{
			return(fno+sno);
		
	};
	System.out.println(ia.add(100, 200));
	}

	@Override
	public int add(int fno, int sno) {
		// TODO Auto-generated method stub
		return 0;
	}
	}
