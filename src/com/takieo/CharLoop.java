package com.takieo;

public class CharLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch='A';
		for(int i=0;i<5;++i)
		{
			for(int j=0;j<5;++j)
		{
			System.out.print(ch);
			++ch;
		}
		System.out.println();
		}
	}

}
