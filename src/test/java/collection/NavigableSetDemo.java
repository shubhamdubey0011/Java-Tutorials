package collection;

import java.util.TreeSet;

public class NavigableSetDemo 

{

	public static void main(String[] args) 
	{
	   TreeSet<Integer> navigableset = new TreeSet<Integer>();	
	   navigableset.add(1000);
	   navigableset.add(4000);
	   navigableset.add(3000);
	   navigableset.add(2000);
	   navigableset.add(5000);
	  // System.out.println(navigableset);
	   
	   System.out.println(navigableset.ceiling(1000));
	   System.out.println(navigableset.higher(2000));
	   System.out.println(navigableset.floor(3000));
	   System.out.println(navigableset.lower(4000));
	   
	   
	   
	}
}
