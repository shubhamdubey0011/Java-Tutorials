package net.valtech.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySortingNaturalO 
{

	
	public static void main(String[] args) 
	{
	
		
		ArrayList array = new ArrayList();
		array.add("Z");
		array.add("A");
		array.add("N");
		array.add("K");
		//array.add(new Integer(10));//class cast exception
		//array.add(null);Null pointer exception 
		System.out.println(array);
		Collections.sort(array);
		System.out.println(array);
	}
}
