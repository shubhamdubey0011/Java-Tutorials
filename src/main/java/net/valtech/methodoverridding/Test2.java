package net.valtech.methodoverridding;


class Parent1 
{
     int x=888;
}
class Child1 extends Parent1
{
     int x=999;
}


public class Test2 
{

	public static void main(String[] args)
	{
		Parent1 p=new Parent1();
		System.out.println(p.x);//888
		Child1 c=new Child1();
		System.out.println(c.x);//999
		Parent1 p1=new Child1();
		System.out.println(p1.x);//888
	}

	
}
//Note :-•	Overriding concept is not applicable for variables.
       /*•	Variable resolution is always takes care by compiler based on reference type.*/
