package net.valtech.methodOverloading;

public class Test5 
{

	public void methodOne(int i)
	{
		System.out.println("general method");
	}
	public void methodOne(int...i)
	{
		System.out.println("var-arg method");
	}
	public static void main(String[] args)
	{
		Test5 t=new Test5();
		t.methodOne();//var-arg method
	   t.methodOne(10,20,30);//var-arg method
		t.methodOne(10);//general method
	}

}
