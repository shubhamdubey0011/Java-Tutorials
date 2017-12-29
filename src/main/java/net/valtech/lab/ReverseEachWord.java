package net.valtech.lab;

public class ReverseEachWord {

	static void reverseEachWordOfString(String inputString) {
		String[] words = inputString.split(" ");

		String reverseString = "";

		System.out.println(words.length);
		for (int i = 0; i < words.length; i++) {
			// Taking each word and reversing it
			String word = words[i];
			System.out.println("each word ::" + word);

			String reverseWord = "";
             
			//reversing each word,word by word 
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
				System.out.println("reverseWord :: " + reverseWord);
			}
			// Appending reverseword into reverse string
			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(inputString);

		// print revrse String
		System.out.println(reverseString);

		System.out.println("-------------------------");
	}

	public static void main(String[] args) {
		reverseEachWordOfString("Red Fox");

		// reverseEachWordOfString("Java Concept Of The Day");
		//
		// reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");
		//
		// reverseEachWordOfString("I am string not reversed");
		//
		// reverseEachWordOfString("Reverse Me");
	}
}
