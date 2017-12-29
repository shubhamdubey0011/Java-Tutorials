package net.valtech.collection.map;

import java.util.HashMap;

class HashMapDemo1 
{
	public static void main(String[] args) 
	{
		//HashMap m=new HashMap();
		
		//IdentityHashMap m = new IdentityHashMap();
		 HashMap m = new HashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		System.out.println(i1.equals(i2));
		
		System.out.println(i1==i2);
		m.put(i1,"pavan");
		m.put(i2,"kalyan");
		System.out.println(m);
	}
}

