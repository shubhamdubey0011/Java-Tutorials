package net.valtech.practise;

public class Test_2 
{
//	public static void main(String[] args) 
//	{
//		System.out.println(args.length);
//		int x=0;
//		if(args.length>=0)
//		{
//			x=10;
//		}
//		System.out.println(x);//C.E:variable x might not have been initialized
//	}
//	

	
	
//	public static void main(String[] args) 
//	{
//		int x;
//		if(args.length>0)
//		{
//			x=10;
//		}
//		else
//		{
//			x=20;
//		}
//		System.out.println(x);
//	}
	
	
	
//	public static void main(String[] args) 
//	{
//		
//        //public int x=10;
//		//private int x=10;
//		//protected int x=10;	C.E: illegal start of expression
//		//static int x=10;
//		//volatile int x=10;
//		//transient int x=10;
//		final int x=10;//(valid)
	
	
	public static void sum(int... x)
	{
		int total=0;
		System.out.println("augrumnt length is ::"+x.length);
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
