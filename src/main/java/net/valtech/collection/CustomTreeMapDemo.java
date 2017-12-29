package net.valtech.collection;

import java.util.Comparator;
import java.util.TreeMap;

public class CustomTreeMapDemo 
{

	public static void main(String[] args) 
	{
	
		
	TreeMap tree = new TreeMap();
	tree.put("ZZZ", 10);
	tree.put("YYY", 20);
	tree.put("XXX", 30);
	tree.put("WWW", 40);

	System.out.println(tree);
	}
}

class Mycustomtreemap implements Comparator
{
	
	public int compare(Object ob1,Object ob2)

	{
		String s1 = ob1.toString();
		String s2=ob2.toString();
		return -s2.compareTo(s1);

		
		
	}
	
}