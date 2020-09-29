package net.valtech.Interitance;
class Parent
{
	public void one()
	{
		System.out.println("from Parent class method one");
	}
}
class Child extends Parent
{

	public void two()
	{
		System.out.println("from child class method Two");
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
	c.two();//from class Two

	
	
	Parent c2=new Child();
	c2.one();//from class Two
	//c2.two();

	
	//Child cannot store parent object 
	//Child c4= new Parent();
	
	
   Child c3=(Child) new Parent();
   c3.one();
   c3.two();
	
	
	 
	 
}
}
