package net.valtech.Dynamic_polymosphism;

/*Method overidding with instance method is called as dynamic */

class sample1 
{
	 //static void calculate(int a)//square value 81
	  void calculate(int a)//square root  3.0

	{
		System.out.println("square value " + (a * a));
	}
}

class sample2 extends sample1 {
	void calculate(int a)
	{
		System.out.println("square root  " + Math.sqrt(a));

	}
}
public class MethodOverriddingInstanceMetod {

	public static void main(String[] args) {

		// super class object
		sample1 s1 = new sample1();
		 s1.calculate(9);

		// sub class object
		sample2 s2 = new sample2();
	     s2.calculate(9);

		// super class reference refer to sub class;tried to store sub class
		// reference to super class
		sample1 s3 = new sample2();
		s3.calculate(9);

		// sub class refernce refer to super class;tried to store sub class
		// reference into super class
		/*
		 * super class reference cannot be stored in sub class sample2 s4=new
		 * sample1(); s3.calculate(9);
		 */

	}
}

/*
 * Note: In overriding runtime object will play the role and reference type is
 * dummy.Static method cannot be overridden 
 */