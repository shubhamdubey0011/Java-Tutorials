package net.valtech.Strings;

import com.jayway.jsonpath.internal.function.text.Length;

//To find a particualar repeating character in given string .
public class CountCharacterOccurence {
	public static void main(String[] args) {
		String s = "Java is java again java again";

		char c = 's';

		int count = s.length() - s.replace("s", "").length();
		
		System.out.println(s.length());//29
		System.out.println(s.replace("s","").length());//26

	System.out.println("Number of occurances of 's' in " + s + " = "
				+ count);
	}

}
