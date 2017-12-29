package net.valtech.OOPS;

public class Initilization 
{

	private static String methodOne(String msg)
	{
		System.out.println(msg);
		return msg;
	}
	public Initilization()
	{
		m=methodOne("1");
	}
	{
		m=methodOne("2");
	}
	String m=methodOne("3");
	public static void main(String[] args)
	{
		Object obj=new Initilization();
	}

}
