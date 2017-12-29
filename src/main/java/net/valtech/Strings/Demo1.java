package net.valtech.Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo1 {
	static void duplicateCharCount(String inputString) {

		HashMap<Character, Integer> mapCountArray = new HashMap<Character, Integer>();

		char[] strgChrArray = inputString.toCharArray();

		for (char c : strgChrArray) 
		{

			if (mapCountArray.containsKey(c)) {

				mapCountArray.put(c, mapCountArray.get(c) + 1);

			} else {

				mapCountArray.put(c, 1);
			}

		}
			Set<Character> mapset = mapCountArray.keySet();

			System.out.println("Duplicate Characters In " + inputString);

			for (Character character : mapset) {
				if (mapCountArray.get(character) > 1) {

					System.out.println(character + " : "
							+ mapCountArray.get(character));
				}
			}

		}

	

	public static void main(String[] args) {
		duplicateCharCount("shubham");
	}
}
