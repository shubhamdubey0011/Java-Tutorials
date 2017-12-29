package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.valtech.collection.collectionsDemo;

public class SynchArrayListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("shubham");
	    List list = Collections.synchronizedList(al);	
	    System.out.println(list.get(0));

	

	}
}
