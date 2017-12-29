package net.valtech.methodOverloading;

public class Test2 
{
	public void methodOne(String s)
	{
		System.out.println("String version");
	}
	public void methodOne(Object o)		     //Both methods are said to 
							     //be overloaded methods.
	{
		System.out.println("Object version");
	}
	public static void main(String[] args)
	{
		Test2 t=new Test2();
		t.methodOne("bhaskar");//String version
		t.methodOne(new Object());//Object version
		t.methodOne(null);//String version
	}


}
