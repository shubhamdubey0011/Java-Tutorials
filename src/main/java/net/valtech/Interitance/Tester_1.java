package net.valtech.Interitance;


class Demo1
{

	
	Demo1()
	{
		
		System.out.println("from demo1()");
	}
	

}

class Demo2 extends Demo1
{

	Demo2(int a)
	{
		
		System.out.println("from Demo2(int a)");
	}
	
	
	Demo2()
	{
		
		this(90);
		System.out.println("from demo2()");
	}
	

}




class Demo3 extends Demo2
{

	Demo3()
	{
		
		
		System.out.println("from demo3()");
	}
	

}


public class Tester_1 
{

	public static void main(String[] args) 
	{
		
		
		Demo3 demo = new Demo3();
		
	}
	
	
}
