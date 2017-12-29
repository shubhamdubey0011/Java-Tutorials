package net.valtech.Interitance;
class Parent
{
	public void one()
	{
		System.out.println("from class one");
	}
}
class Child extends Parent
{

	public void two()
	{
		System.out.println("from class Two");
	}
	
}

public class InheritanceDemo 
{
 public static void main(String[] args) 
 {

	Parent p=new Parent();
	 p.one();//from class one
	 
	 
	Child c=new Child();
	c.one();//from class Two
	c.one();//from class Two

	
	
	Parent c2=new Child();
	c2.one();//from class Two

	
   //Child c2=new Parent();
	
	
	 
	 
}
}
