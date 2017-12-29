package net.valtech.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {
	public static void main(String[] args) {

		/*
		 * 1.Using inbult reverse builder method
		 * 
		 * 
		 * String input = "Geeks for Geeeks";
		 * 
		 * StringBuilder input1 = new StringBuilder();
		 * 
		 * // append a string into StringBuilder input1 input1.append(input);
		 * 
		 * // reverse StringBuilder input1 input1 = input1.reverse();
		 * 
		 * // print reversed String for (int i = 0; i < input1.length(); i++)
		 * 
		 * System.out.print(input1.charAt(i));
		 * 
		 * 
		 * 
		 * 
		 * //2.Using Reverse for loop String s1 = "Shubham Dubey"; int count =
		 * s1.length(); for (int i = count - 1; i >= 0; i--)
		 * System.out.print(s1.charAt(i));
		 * 
		 * // 3.Java program to ReverseString using ByteArray.
		 * 
		 * 
		 * String input2 = "GeeksforGeeks";
		 * 
		 * // getBytes() method to convert string // into bytes[]. byte []
		 * strAsByteArray = input2.getBytes();
		 * 
		 * byte [] result = new byte [strAsByteArray.length];
		 * 
		 * // Store result in reverse order into the // result byte[]
		 * 
		 * for (int i = 0; i<strAsByteArray.length; i++) result[i] =
		 * strAsByteArray[strAsByteArray.length-i-1];
		 * 
		 * System.out.println(new String(result));
		 * 
		 * 
		 * 
		 * // 4.Java program to Reverse a String by // converting string to
		 * characters one // by one String input3 = "GeeksForGeeks";
		 * 
		 * // convert String to character array // by using toCharArray char[]
		 * try1 = input3.toCharArray();
		 * 
		 * for (int i = try1.length-1; i>=0; i--) System.out.print(try1[i] );
		 */

		// 5.Java program to Reverse a String using ListIterator

		// String input4 = "Geeks For Geeks";
		// char[] hello = input4.toCharArray();
		// List<Character> trial1 = new ArrayList<Character>();
		//
		// for (char c: hello)
		// trial1.add(c);
		//
		// Collections.reverse(trial1);
		// ListIterator li = trial1.listIterator();
		// while (li.hasNext())
		// System.out.print( li.next());
		//

		System.out.println(recursiveMethod("Shubham Dubey"));

	}

	static String recursiveMethod(String str) {

		if (str == null || str.length() <= 1) {

			return str;

		}
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

}
