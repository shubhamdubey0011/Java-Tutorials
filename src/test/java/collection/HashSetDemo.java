package collection;

import java.util.HashSet;

public class HashSetDemo 
{

	public static void main(String[] args) 
	{
		HashSet hash=new HashSet();
		hash.add(null);
		hash.add("shubham");
		hash.add(null);
		hash.add("shubham");
		hash.add(new StringBuffer("Valtech"));
		hash.remove(null);
		System.out.println(hash);
		
	}
}
