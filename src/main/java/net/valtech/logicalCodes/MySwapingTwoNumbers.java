package net.valtech.logicalCodes;

public class MySwapingTwoNumbers 
{

	 public static void main(String a[]){
	        int x = 10;
	        int y = 20;
	        System.out.println("Before swap:");
	        System.out.println("x value: "+x);//10
	        System.out.println("y value: "+y);//20
	        x = x+y;//30=10+20
	        y=x-y;//10=30-20
	        x=x-y;//20=30-10
	        System.out.println("After swap:");
	        System.out.println("x value: "+x);//20
	        System.out.println("y value: "+y);//10
	    }
	
}
