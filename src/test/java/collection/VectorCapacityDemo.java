package collection;

import java.util.Vector;

public class VectorCapacityDemo 

{

	public static void main(String[] args) 
	{
	
		
		Vector vector = new Vector();
		
		for (int i = 1; i <= 10; i++) 
		{
			
		    vector.add(i);	
		}
		System.out.println(vector.capacity());
		System.out.println(vector);
		vector.addElement("shubham");
		System.out.println(vector.capacity());
		System.out.println(vector);
		
	}
}
