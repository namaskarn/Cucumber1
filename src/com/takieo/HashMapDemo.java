package com.takieo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

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
	
	for(Integer no: addKeys)
	{
		System.out.println(no);
	}

	}
}
