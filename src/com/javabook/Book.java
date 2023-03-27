package com.javabook;

public class Book {

	public static void main(String[] args) {
		// constant score values
		
		final int TOUCHDOWN=6;
		final int CONVERSION=1;
		final int FIELDGOAL=3;
		
		//calculate points scored
		int td, pat, fg, total;
		td=4* TOUCHDOWN;
		pat=3*CONVERSION;
		fg=2*FIELDGOAL;
		total=(td+pat+fg);
		System.out.println("Score:"+total); //33
		
		int num=100; int factor=20; int sum=0;
		
		sum=num+factor;
		sum=num-factor;
		sum=num*factor;
		sum=num/factor;
		
		String txt="Super"; String lang="Java";
		txt+=lang;//super java
		
		int sum=10; int num=20;
		sum+=num;//30
		
		String txt="Super"; String lang="java";
		
		boolean state=(text==lang);//false
		boolean state = (text!=lang);//true
		
		int dozen=12; int score=20;
		state=(dozen>score);//false
		state=(dozen<score);//true
		
		//to test both conditions are true
		boolean yes = true; boolean no=false;
		boolean result =(yes && yes);//true
		boolean result =(yes && no);//false
		
		//to test if either of two conditions  is true
		result=(yes||yes);//true
		result=(yes||no);//true
		result=(no||no);//false
		result= yes;//true
		result=!yes;//false
		
		
		int num1 =1357; int num2 =2468;
		result=(num1 % 2 !=0)? "Odd": "Even";//odd
		
		int sum=32-8+16*2;//56
		sum=(32-8+16)*2;//80
		sum=(32-(8+16))*2;//16
		
		/*
		
		\n Newlime
		\t Tab
		\b Backspace
		\r Carriage return
		\f Formfeed
		\\ Backslash
		\' Single quote mark
		\" Double quote mark 
		& AND
		| OR
		^ XOR
		<< Leftshift
		>> Rightshift
		~ NOT
		
		*/
		 
		 int hrs = 11;
		 if (hrs<13)
		 {
			 System.out.println("Goodmorning");
		 }
		
		 else if
		 {
		System.out.println("Good Afternoon");
		
			 
		 }
		//class switch
		 int month =2, year=2018, num=31;
		 switch(month)
		 {
		// case1: num=(year % 4==0)? 29:28;break;
		 System.out.println(month+"\"+year+":"+num+"days");"
		 
		//Class for
				 
		int num =0;
		 
		 for(int i=1; i<4; i++)
		 {
			 System.out.println("Outer Loop i=" +i);
			 
	//Class while
			 int num = 100;
			 while(num>0);
			 num-=10;
			 {
				 System.out.println("hundred goes down upto 0 :"+num);
				 
			//class DoWhile
				 int num =100;
				 do
				 {
					 System.out.println("showing once what is num now"+num);//100
					 num+=10;// to avoid infinite loop
					 
					 //class break
					 
					 for (int i=1; i<4; i++)
					 {
						 for(int j=1; j<4; j++)
						 {
							 System.out.println("Iwill be looping like i1 i1 i1 but Jwill be j1 j2 j3"+i+j="+j");
							 
						 }
						 break;
						 
						 
						//Class Array
						 
						 String[]str= {"Much","More","Java"};//str[0]str[1]str[2]
						 int[]num=new int[3];//num[0]num[1]num[2]
						 
						 num[0]=100;
						 num[1]=200;
						 str[1]="Better";
						 
						 System.out.println(str.length);//3
						 System.out.println(num.length);//3
						 System.out.println(num[0]+num[1]+num[2]);//100,200,0
						 System.out.println(str[0]+str[1]+str[2]);//Much Better Java
						 
						 
					 }
					 
				 }
				 
			 }
			 
		 }
		 		
		 
		 }
		
		
		

	}

}
