
/*for the instance variable its not required to intialize the variable,JVM will do that automatically */
package net.valtech.variable;

public class InstanceVariable_2
{

	
	boolean b;
	public static void main(String[] args) 
	{
		InstanceVariable_2 t=new InstanceVariable_2();
		System.out.println(t.b);//false
	}

}
