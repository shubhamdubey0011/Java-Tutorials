package net.valtech.variable;

public class localVariable_1 {

	public static void main(String[] args) 
	{
		try 
		{
			int i = Integer.parseInt("ten");
		} 
		catch (NullPointerException e) 
		{
            //System.out.println(i);//cannot find the symbol "i"
		}
	}

}
