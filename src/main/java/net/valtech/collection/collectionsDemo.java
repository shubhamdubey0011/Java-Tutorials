package net.valtech.collection;

import java.util.ArrayList;
import java.util.Collections;

public class collectionsDemo 
{
 public static void main(String[] args) 
 {

	 ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		l.add("10");//ClassCastException
		//l.add(null);//NullPointerException
		System.out.println("Before sorting :"+l);//[Z, A, K, N]
		Collections.sort(l);
		System.out.println("After sorting :"+l);//[A, K, N, Z]

	 
}
}
