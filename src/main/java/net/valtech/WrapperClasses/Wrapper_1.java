package net.valtech.WrapperClasses;

public class Wrapper_1 
{

public static void main(String[] args) 
{
//
//	Integer i=new Integer("10");
//	System.out.println(i);//NumberFormatException

	
	Boolean b1=new Boolean(true);
	System.out.println(b1);
	System.out.println("=====================");
	Boolean b2=new Boolean(false);
	System.out.println(b2);
	System.out.println("bbbbbbbbbbb "+b1.equals(b2));//fase
	
	Boolean b3=new Boolean("true");
	System.out.println(b3);
	System.out.println("=====================");
	Boolean b4=new Boolean("True");
	System.out.println(b4);
	
	Boolean b5=new Boolean("false");
	System.out.println(b5);
	System.out.println("=====================");
	Boolean b6=new Boolean("False");
	System.out.println(b6);
	
	Boolean b7=new Boolean("bhaskar");
	System.out.println(b7);
		
	
	System.out.println("b1 equals to b2"+b1.equals(b2));//false
	System.out.println(b1==b2);//false
	System.out.println("=====================");
	System.out.println("b3 equals to b4"+b3.equals(b4));//true
	System.out.println(b3==b4);//true
	System.out.println("=====================");
	System.out.println("b5 equals to b6"+b5.equals(b6));//true
	System.out.println(b5==b6);//false
	
	
	
	


}
}
