package net.valtech.Strings;

public class Teststringcomparison 

{
public static void main(String[] args) {
	

	/*The String equals() method compares the original content of the string. It compares values of string for equality.*/
	
	
	   String s1="Sachin";  
	   String s2="Sachin";  
	   String s3=new String("Sachin");  
	   String s4="Saurav";  
	   System.out.println(s1.equals(s2));//true  
	   System.out.println(s1.equals(s3));//true  
	   System.out.println(s1.equals(s4));//false  
	 }  
}
