package net.valtech.Interitance;


class E
{

	E()
	{
		System.out.println("from E() constrctore");
	}
	
}

class F extends E
{

	F()
	{
		System.out.println("from F() constrctore");
	}
	
}



class G extends F
{

	G()
	{
		System.out.println("from G() constrctore");
	}
	
}


public class Multilevel_Inheritance 
{
   public static void main(String[] args) 
   {
	G rv = new G();
	
	
} 
}
