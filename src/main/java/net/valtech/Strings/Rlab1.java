package net.valtech.Strings;

public class Rlab1 {

	 public static String reverse(String s1)
	 {
	 int l = s1.length();
	 //System.out.println("length is "+ l);
	
	 if (l>1)
	 return(s1.substring(l-1) + reverse(s1.substring(0,l-1)));
	 else
	 return(s1.substring(0));
	 }
	 public static void main(String[] args){
	 String[] st = "RED FOX".split(" ");
	
	 String r = "";
	 for (String word : st)
	
	 r += " "+ reverse(word);
	 System.out.println("Reversed words in the given string: "+r.trim());
	 }
	

	
	
//To give the count of number of words in a string 
	// public static void main(String[] args) {
	//
	// String countries = "INDAIA JAPAN KOREA";
	//
	// String[] names = countries.split(" ");
	// System.out.println(names.length);
	//
	// }

}
