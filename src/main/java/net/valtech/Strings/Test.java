package net.valtech.Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


//To find the duplicate Characters in a string 
public class Test {

	public static void duplicateCharIntring(String inputString) {

		char[] charArray = inputString.toCharArray();

		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

		for (char character : charArray) {

			if (charCount.containsKey(character)) {

				charCount.put(character, charCount.get(character) + 1);

			}

			else {
				charCount.put(character, 1);

			}

		}

		Set<Character> chars = charCount.keySet();
		for (Character character : chars) {

			if (charCount.get(character) > 1) {

				System.out
						.println(character + " : " + charCount.get(character));

			}

		}

	}

	public static void main(String[] args) {

		duplicateCharIntring("Java J2EE Java JSP J2EE");
	}
}
