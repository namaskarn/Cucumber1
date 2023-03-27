package com.takieo;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>addGames=new ArrayList<String>();
		
		addGames.add("Cricket");
		addGames.add("Football");
		addGames.add("Chess");
		addGames.add("Hockey");
		
		System.out.println("...iterable by passing lambda exps..");
		
		addGames.forEach(games->System.out.println(games));//one method
		
		addGames.forEach(System.out::println);//one more method to print one one element
		
		addGames.stream().forEachOrdered(games->System.out.println(games));//one more method
		
		addGames.stream().forEachOrdered(System.out::println);//one more method
		

	}

}
