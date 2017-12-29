package net.valtech.staticpolymorphism;

class Sample {

	static void add(int a, int b)
	{

		System.out.println("sum a+b is " + (a + b));
	}
	static void add(int a, int b, int c) {

		System.out.println("sum a+b+c is " + (a + b + c));
	}

}

public class MethodOverloadingStaticMethod 
{
	public static void main(String[] args) 
	{  
		
	    
	   Sample  rv1=new Sample();
	   rv1.add(2, 3);
	   rv1.add(1, 4, 1);
	  
	  

	}

}
