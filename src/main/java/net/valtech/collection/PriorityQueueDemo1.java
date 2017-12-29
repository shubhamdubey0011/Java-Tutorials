package net.valtech.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 
{
	public static void main(String[] args) 
	{
		PriorityQueue q=new PriorityQueue(new DemoComp13());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		//q.offer(null);
		System.out.println(q);//[Z, B, L, A]
		}

}

class DemoComp13 implements Comparator
{

	public int compare(Object o1, Object o2)
	{
	
		String s1=(String)o1;
		String s2=o2.toString();
		return s2.compareTo(s1);

		
	}
	

}
