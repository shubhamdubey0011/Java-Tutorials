package collection;

import java.util.Vector;

public class VectorDemo 
{

	public static void main(String[] args) 
	{
	
		Vector vector = new Vector();
		vector.addElement("Mr");
		vector.addElement(new StringBuffer("Shubham"));
		vector.removeAllElements();
		System.out.println(vector);
				
		
		
	}
}
