package collection;

import java.util.TreeSet;

public class TreesetDemo 
{

	public static void main(String[] args) 
	{
	
		TreeSet ts = new TreeSet(); 
		//ts.add(null);
		//ts.add(new StringBuffer("SHubham"));
		ts.add("shubham");
		ts.add("shubham");
		ts.add(10);
		ts.add(new Integer(10));
		System.out.println(ts);
		
		
	} 
	
}
