package net.valtech.Interitance;





class Demo10
{
  
	Demo10()
	{
		System.out.println("from Demo10()");
		
	}
	
}

class Demo20 extends  Demo10
{
  
	
	Demo20(int a)
	{
		System.out.println("from Demo20(int a)");
		
	}
	Demo20()
	{
		this(90);
		System.out.println("from Demo20()");
		
	}
	
}
class Demo5 extends  Demo20
{
 
	Demo5()
	{
		
		System.out.println("from Demo5()");
		
	}
	
}
public class Tester_4 
{
public static void main(String[] args) 
{

	Demo5 demo = new Demo5();
		
		
		
}
}
