package net.valtech.methodoverridding;


class Parent 
{
	public void property()
	{
		System.out.println("cash+land+gold");
	}
	public void marry()
	{
		System.out.println("subbalakshmi");	   
	}
}
class Child extends Parent					   
{
	public void marry()
	{
		System.out.println("Trisha/nayanatara/anushka");	 
	}
}

public class Test 
{

	public static void main(String[] args) 
	{
		Parent p=new Parent();
		p.marry();//subbalakshmi(parent method)
		Child c=new Child();
		c.marry();//Trisha/nayanatara/anushka(child method)
		Parent p1=new Child();
		p1.marry();//Trisha/nayanatara/anushka(child method)
		
		
		
	
	}

}
