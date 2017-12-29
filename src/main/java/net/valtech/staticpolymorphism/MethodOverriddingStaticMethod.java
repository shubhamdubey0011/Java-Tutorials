package net.valtech.staticpolymorphism;

class Sample1
{
	 static void calculate(int a)
	{
		
		System.out.println("square value of a is "+(a*a));
	}
}

class Sample2 extends Sample1
{
	 static void calculate(int a)
	{
		
		System.out.println("square root of a is "+ Math.sqrt(a));
	}
}
public class MethodOverriddingStaticMethod 
{

public static void main(String[] args) {
	

	Sample1	s1=new Sample1();
	s1.calculate(9);
	
	Sample2 s2=new Sample2();
	s2.calculate(9);
	
	//storing sub class refernce to super class 
	Sample1 s3=new Sample2();
	s3.calculate(9);
	
	//We cannot store super class reference in sub class 
	//Sample2 s4= new Sample1();
	//s4.calculate(9);
	
	
	
	

}
}
