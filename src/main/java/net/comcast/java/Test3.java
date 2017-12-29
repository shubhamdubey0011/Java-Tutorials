package net.comcast.java;

public class Test3 {
	
	public static void sum(int... x)
	{
		int total=0;
		for(int i=0;i<x.length;i++)
		{
			total=total+x[i];
		}
		System.out.println("The sum :"+total);
	}
	public static void main(String[] args)
	{
		sum();
		sum(10);
		sum(10,20);
		sum(10,20,30,40);
	}

}
