package net.valtech.variable;

public class localVariable_3

{

	public static void main(String[] args) {
		int x=2;

		if (args.length > 0) 
		{
			x = 1;
		}
		
		System.out.println(x);// C.E:variable x might not have been initialized
	}

}
