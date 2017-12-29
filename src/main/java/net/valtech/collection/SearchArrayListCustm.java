package net.valtech.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SearchArrayListCustm 
{

	public static void main(String[] args) 
	{
	
		ArrayList l=new ArrayList();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		System.out.println(l);//[15, 0, 20, 10, 5]
		Collections.sort(l,new comp12());
		System.out.println(l);//[20, 15, 10, 5, 0]
		System.out.println(Collections.binarySearch(l,10,new comp12()));//2
		System.out.println(Collections.binarySearch(l,13,new comp12()));//-3
		System.out.println(Collections.binarySearch(l,17));//-6

	}
}
class comp12 implements Comparator
{

	public int compare(Object o1, Object o2) {
		
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);

	}
	
}
