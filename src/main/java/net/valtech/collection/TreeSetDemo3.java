//Write a program to insert String objects into the TreeSet where the sorting order is reverse of alphabetical order.
package net.valtech.collection;

import java.util.Comparator;
import java.util.TreeSet;

class TreeSetDemo3 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new MyComparator1());
		t.add("Roja");
		t.add("ShobaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println("" +t);//[ShobaRani, Roja, Ramulamma, RajaKumari, GangaBhavani]
	}
}
class MyComparator1 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=(String)obj2;
	    
		return -s1.compareTo(s2);
	}
}

