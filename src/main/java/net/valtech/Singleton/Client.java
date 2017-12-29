package net.valtech.Singleton;

class Test 
{
	private static Test t=null;//private static variable which returns intance of class 
	
	private Test() //private constructor 
	{}
	public static Test getTest()//a public method getTest() method is a factory method
	{
		if(t==null)
		{
			t=new Test();
		}
		return t;
	}
}


class Client 
{

	public static void main(String[] args)
	{
		System.out.println(Test.getTest().hashCode());//1671711
		System.out.println(Test.getTest().hashCode());//1671711
		System.out.println(Test.getTest().hashCode());//1671711
		System.out.println(Test.getTest().hashCode());//1671711
	}

}
