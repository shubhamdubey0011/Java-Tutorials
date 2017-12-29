//Requirement: Write a program to insert StringBuffer objects into the TreeSet where the sorting order is alphabetical order.
package net.valtech.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest2 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new MyComparator3());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);// [A, K, L, Z]
	}
}
class MyComparator3 implements Comparator
{
	public int compare(Object obj1,Object obj2)
		{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s1.compareTo(s2);
		}


}
