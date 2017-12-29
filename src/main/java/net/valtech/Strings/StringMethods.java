package net.valtech.Strings;

public class StringMethods 
{

	
public static void main(String[] args) 
{

//charAt() Method 	
//	{
//		String s="bhaskar";
//		System.out.println(s.charAt(3));//s
//		System.out.println(s.charAt(100));//StringIndexOutOfBoundsException
//		}
	
	
	//concat() method 
	
//	String s="bhaskar";
//	s=s.concat("software");
//	//s=s+"software";//•	The overloaded “+” and “+=” operators also meant for concatenation purpose only.
//	//s+="software";
//	System.out.println(s);//bhaskarsoftware
	
	
	//4)	public boolean equalsIgnoreCase(String s);
//	String s="bhaskar";
//	System.out.println(s.equals("bhaskar"));//true
//	System.out.println(s.equalsIgnoreCase("BHASKAR"));//true
	
	//5)	public String substring(int begin);
//	String s="vijayabhaskar";
//	System.out.println(s.substring(6));//bhaskar
	
	
//	6)	public String substring(int begin, int end);
//	String s="vijayabhaskar";
//	System.out.println(s.substring(6));//bhaskar
//	System.out.println(s.substring(3,7));//ayab

	
//	7)	public int length();
	
//	String s="vijayabhaskar";
//	System.out.println(s.length());//13
//	//System.out.println(s.length);//compile time error
//	//StringInternDemo.java:7: cannot find symbol
//	//symbol  : variable length
//	//location: class java.lang.String

	
	
//	8)	public String replace(char old,char new);
//	String s="ababab";
//	System.out.println(s.replace('a','b'));//bbbbbb


//	9)	public String toLowerCase();
//	String s="BHASKAR";
//	System.out.println(s.toLowerCase());//bhaskar
	

	
//	10)	public String toUpperCase();
//	String s="bhaskar";
//	System.out.println(s.toUpperCase());//BHASKAR
	
//	11)	public String trim()	
//	String s="  bha skar  ";
//	System.out.println(s.trim());//bha skar

//	12)	public int indexOf(char ch);
//	String s="vijayabhaskarreddy";
//	System.out.println(s.indexOf('r'));//3
//	System.out.println(s.indexOf('f'));//-1

	//13)	public int lastIndexOf(Char ch);
	
	String s="vijayabhaskarreddy";
	System.out.println(s.lastIndexOf('a'));//11
	System.out.println(s.indexOf('z'));//-1


	
	
	
}	
}
