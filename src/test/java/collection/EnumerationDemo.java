package collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo 
{

	public static void main(String[] args) 
	{
	
		Vector v = new Vector();
		for (int i = 0; i < v.capacity(); i++) 
		{
		  v.add(i);	
		}
		System.out.println(v);
		
		
		Enumeration enm = v.elements();
		while (enm.hasMoreElements()) 
		{
			Integer object = (Integer) enm.nextElement();
		  if (object%2==0) 
		  {
			System.out.print(object + " ");
		}	
		  
		}
	}
}
