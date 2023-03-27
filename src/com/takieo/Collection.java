package com.takieo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hs= new HashMap<>();

		hs.put(100, "rani");
		hs.put(101, "malli");
		hs.put(102, "karuna");
		hs.put(103, "lilly");
			
		System.out.println(hs);

		String name = hs.get(100);
		System.out.println(name);
		
		Set<Integer>addKeys=hs.keySet();
		
		
		Iterator<Integer>it=addKeys.iterator();
		
		while(it.hasNext())
{
	Integer num=it.next();

}
	Collection<String>addValues=hs.values();
{
	for(String nam : addValues)
	{
		System.out.println(nam);
	}
}

	}

}
