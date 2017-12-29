package net.valtech.collection;

import java.util.LinkedHashSet;

class LinkedHashSetDemo
{
	//can store null,cannot store duplicate ,not an indexed type 
 public static void main(String args[])
 {
  LinkedHashSet< String> hs = new LinkedHashSet< String>();
  hs.add("B");
  hs.add("A");
  hs.add("D");
  hs.add("E");
  hs.add("C");
  hs.add("C");
  hs.add("F");
  hs.add(null);
  System.out.println(hs.size());
  System.out.println(hs);
 }
}
