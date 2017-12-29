package net.valtech.Dynamic_polymosphism;

/*Method loading with instance methods are called as dynamic polymorphism*/

class Sample 
{
	void add(int a, int b)
	{

		System.out.println("sum of a + b is  " + (a + b));
	}
	
	void add(int a, int b, int c) {

		System.out.println("sum of a + b + c  is  " + (a + b + c));

	}
}

 class MethodOverloadingInstanceMethods 
{
	public static void main(String[] args) 
	{

		Sample s1 = new Sample();
		s1.add(2, 3);
		s1.add(2, 4, 5);
		



		


			
	}
	}
	



/*Note •	In overloading method resolution is always based on reference type and runtime object won’t play any role in overloading.*/