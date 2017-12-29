package net.valtech.logicalCodes;

public class WordCount {

	public static void main(String args[]) {
		String s = "India ,Japan, Canda";

		int count = 1;

		System.out.println("total number of characters :: "+s.length());
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;

			}
		}
		System.out.println("Number of country name  = " + count);
	}
}
