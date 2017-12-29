package net.valtech.collection.map;

import java.util.HashMap;

class MapDemo 
{
	public static void main(String[] args) 
	{
		HashMap m=new HashMap();
		m.put("100","vijay");
		System.out.println(m);//{100=vijay}
		m.put("100","bhaskar");
		System.out.println(m);//{100=bhaskar}
	}
}

