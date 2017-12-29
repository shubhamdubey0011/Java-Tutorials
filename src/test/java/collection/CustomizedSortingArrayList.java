package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomizedSortingArrayList 
{

	public static void main(String[] args) 
	{
		
		ArrayList<Character> arraylist = new ArrayList<Character>();
		arraylist.add('A');
		arraylist.add('L');
		arraylist.add('k');
		arraylist.add('v');
		arraylist.add('Z');
		System.out.println(arraylist);
		Collections.sort(arraylist);
		System.out.println("Ascending order ::"+arraylist);
		Collections.sort(arraylist,new DescendComparator());
		System.out.println(" Descending order :: "+arraylist);
		System.out.println(Collections.binarySearch(arraylist, 'M', new DescendComparator()));
	} 
	
	
	
}


class DescendComparator implements Comparator
{
public int compare(Object obj1,Object obj2)
{
	Character i1 = (Character)obj1;
	Character i2 = (Character)obj2;
	
	return i2.compareTo(i1);
	
//	if (i1<i2) 
//	   return +1;	
//	else if (i1>i2)
//		return -1;
//	else 
//return 0;
}
	
	
}

