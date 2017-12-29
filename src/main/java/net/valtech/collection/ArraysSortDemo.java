package net.valtech.collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo 
{

	public static void main(String[] args) 
	{
		int[] a={10,5,20,11,6};
		System.out.println("primitive array before sorting");
		for(int a1:a)
		{
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("primitive array after sorting");
		for(int a1: a)
		{
			System.out.println(a1);
		}
		Object[] s={"A","Z","B"};
		System.out.println("Object array before sorting");
		for(Object s1: s)
		{
			System.out.println(s1);
		}
		Arrays.sort(s);
		System.out.println("Object array after sorting");
		for(Object s1:s)
		{
			System.out.println(s1);
		}
		Arrays.sort(s,new Compdemo());
		System.out.println("Object array after sorting by Comparator:");
		for(Object s1: s)
		{
			System.out.println(s1);
		}
	}
	
}

class Compdemo implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);//Descending order
		//return -s2.compareTo(s1);//Ascending order
		
	}
}

