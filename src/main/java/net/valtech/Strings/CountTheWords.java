package net.valtech.Strings;

//To count the number of words in a string 
public class CountTheWords {
	public static void main(String[] args) {

		// String inputString =" india , japan , srlianka";
		//
		// String[] s = inputString.trim().split(",");
		//
		// System.out.println("number of words in the string : " + s.length);
		//
		//

		String inputString = "india japan srlianka";

		int count = 1;

		for (int i = 1; i < inputString.length(); i++) {

			if ((inputString.charAt(i) == ' ')
					&& (inputString.charAt(i + 1) != ' ')) {

				count++;

			}

		}

		System.out.println(count);

	}

}
