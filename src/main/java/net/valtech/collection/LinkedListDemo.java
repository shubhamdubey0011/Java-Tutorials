package net.valtech.collection;

import java.util.LinkedList;

public class LinkedListDemo
{

	//can store null,can store suplicates ,its an indexed type 
	 public static void main(String[] args)
	 {
	  LinkedList< String> ll = new LinkedList< String>();
	  ll.add("a");
	  ll.add("b");
	  ll.add("b");
	  ll.add("c");
	  ll.addLast("z");
	  ll.addFirst("A");
	  ll.add(null);
	  System.out.println(ll);
	 }
}
