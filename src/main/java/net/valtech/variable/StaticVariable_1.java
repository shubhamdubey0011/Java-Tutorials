package net.valtech.variable;

public class StaticVariable_1 
{

	
	static int i=10;
	public static void main(String[] args) 
	{
		StaticVariable_1 st=new StaticVariable_1();
		System.out.println(st.i);//10
		System.out.println(StaticVariable_1.i);//10
		System.out.println(i);//10
	}

}
