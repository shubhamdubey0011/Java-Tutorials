package net.valtech.variable;



/*
 * •Instance variables can be accessed directly from Instance area. But cannot be accessed directly from static area.
•	But by using object reference we can access instance variables from static area.
*/
public class InstanceVariable_1 
{

	 int i=10;
	public static void main(String[] args) 
	{
		///System.out.println(i);//C.E:non-static variable i cannot be referenced from a static context(invalid)
		InstanceVariable_1 iv1=new InstanceVariable_1();
		System.out.println(iv1.i);//10(valid)
		 iv1.methodOne();
	}
	public void methodOne()
	{
		System.out.println(i);//10(valid)
	}

}

