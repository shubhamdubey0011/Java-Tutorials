package net.valtech.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraySortingCustmO 
{

public static void main(String[] args) 
{


	ArrayList l=new ArrayList();
	l.add("Z");
	l.add("A");
	l.add("K");
	l.add("L");
	//l.add(new Integer(10));
	//l.add(null);//NullPointerException
	System.out.println("Before sorting :"+l);//[Z, A, K, L, 10]//as per the index order
	Collections.sort(l,new Mycomp());
	System.out.println("After sorting :"+l);//[Z, L, K, A, 10]///Descending
	}

}

class Mycomp implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=obj2.toString();
		return -s1.compareTo(s2);
	}
}


