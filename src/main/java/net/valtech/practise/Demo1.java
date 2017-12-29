package net.valtech.practise;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo1 {
	public static void main(String[] args) {

		/*String s1 = "Shubham Dubey";
		int count = s1.length();
		for (int i = count - 1; i >= 0; i--)
			System.out.print(s1.charAt(i));*/

		
		
		
		
		ArrayList<String> arr = new ArrayList<String>(); 
		String s1[] = new String[7];
		s1[0]="shubham";
		System.out.println(s1);
		
		

		ListIterator<String> ltr = arr.listIterator();
		while(ltr.hasPrevious())
			System.out.println(ltr.previous() + "\t");
		
	}
}
