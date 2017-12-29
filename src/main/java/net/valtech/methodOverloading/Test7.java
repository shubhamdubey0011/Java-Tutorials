package net.valtech.methodOverloading;


class Parent 
{
public void methodOne(int... i)
{
System.out.println("parent class");
}
}
class Child extends Parent			             
{
public void methodOne(int i)
{
System.out.println("child class");
}
}


public class Test7 
{
	public static void main(String[] args)
	{
	Parent p=new Parent();
	p.methodOne(10);//parent class
	Child c=new Child();
	c.methodOne(10);//child class
	Parent p1=new Child();
	p1.methodOne(10);//parent class
	}

}
