package net.valtech.Strings;

import java.util.Scanner;

public class StringPrograms {

	public static void main(String[] args) {

		// 1.Reverse a String Without using String API
		//
		// String str = "Shubham Dubey";
		// String revstring = "";
		//
		// // for(int i=0;i<=str.length();i++)
		// for (int i = str.length() - 1; i >= 0; i--) {
		// revstring += str.charAt(i);
		// }
		//
		// System.out.println(revstring);
		//
		// }

		// 2)Sorting the String without using String API?

		// String original = "edcba";
		// int j = 0;
		// char temp = 0;
		//
		// char[] chars = original.toCharArray();
		// for (int i = 0; i < chars.length; i++) {
		// for (j = 0; j < chars.length; j++) {
		// if (chars[j] > chars[i]) {
		// temp = chars[i];
		// chars[i] = chars[j];
		// chars[j] = temp;
		// }
		// }
		// }
		//
		// for (int k = 0; k < chars.length; k++) {
		// System.out.print(chars[k]);
		// }

		// 3.Sort the String with using String API?
		// String original1 = "edcba";
		//
		// char[] chars1 = original1.toCharArray();
		// Arrays.sort(chars1);
		//
		// String sorted = new String(chars1);
		// System.out.println(sorted);

		// 4.Check String is palindrome or not?

		// String str="Shubham";
		// String revstring="";
		//
		// for(int i=str.length()-1;i>=0;--i){
		// revstring +=str.charAt(i);
		// }
		//
		// System.out.println(revstring);
		//
		// if(revstring.equalsIgnoreCase(str)){
		// System.out.println("The string is Palindrome");
		// }
		// else{
		// System.out.println("Not Palindrome");
		// }
		//
		// }
		//
		// }

		Integer givennumber = new Integer(535);
		int number = givennumber;
		int reverse = 0;
		while (number != 0)
		{
			int remainder = number % 10;//535%10=53
			System.out.println("remainder is :::"+remainder);
			reverse = reverse * 10 + remainder;// 0*10+5=5
			System.out.println(" reverse is "+reverse);
			number = number / 10;//5/10=5.35
		}
		if (givennumber == reverse)
			System.out.println("Result:Palindrome");
		else
			System.out.println("Result:Not Palindrome");

	}
}
