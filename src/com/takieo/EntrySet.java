package com.takieo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySet {

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
Set set=hs.entrySet();
Iterator it1=set.iterator();
while(it1.hasNext())
{
	Map.Entry m =(Map.Entry)it1.next();
	System.out.println(m.getKey()+"\t"+m.getValue());
	if(m.getKey().equals("null"))
	{
		m.setValue(5000);
		
	}
	System.out.println(hs);
}
	
	}

}
