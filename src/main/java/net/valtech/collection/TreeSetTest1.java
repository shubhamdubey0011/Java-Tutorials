	package net.valtech.collection;
	
	import java.util.Comparator;
	import java.util.TreeSet;
	
	public class TreeSetTest1 
	{
	
		public static void main(String[] args) 
		{
			TreeSet t=new TreeSet(new MyComparator2());
			t.add(10);
			t.add(0);
			t.add(15);
			t.add(5);
			t.add(20);
			System.out.println(t);//[20, 15, 10, 5, 0]
		}
	}
	class MyComparator2 implements Comparator
	{
		public int compare(Object obj1,Object obj2)
		{
			Integer i1=(Integer)obj1;
			Integer i2=(Integer)obj2;
			 
				//return  (-i1.compareTo(i2));//ascending..[0, 5, 10, 15, 20]
				//return  (i2.compareTo(i1));//descending..[20, 15, 10, 5, 0]
				//return i1.compareTo(i2);//[0, 5, 10, 15, 20]**Ascending
				//return -i1.compareTo(i2);//[20, 15, 10, 5, 0**descending
				//return i2.compareTo(i1);//[20, 15, 10, 5, 0]**Descending
				//return -i2.compareTo(i1);//[0, 5, 10, 15, 20]**Ascending
				return -1;//[20, 5, 15, 0, 10]//reverse of insertion order
				//return +1;//[10, 0, 15, 5, 20]//insertion order
				//return 0;//[10]and all the remaining elements treated as duplicate.

				
	
		}
	}
