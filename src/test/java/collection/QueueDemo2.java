package collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueDemo2 
{

	public static void main(String[] args) 
	{
	
		
		
		PriorityQueue q=new PriorityQueue(15,new MyComparators());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		System.out.println(q);//[Z, B, L, A]
		}

	}

class MyComparators implements Comparator
{

	public int compare(Object o1, Object o2) 
	{
	
		
		String s1 = (String) o1;
		String s2 = (String) o2;
		
		
		return -s1.compareTo(s2);
		
			
		
		 
	}
	


}


