package net.valtech.Arrays;

class A {
	int i ;
	A(int i)
	{
		this.i=i;
	}

	public String toString() {
		return "i=" +i;
	}
}

public class Tester {
	public static void main(String[] args) 
	{	
		A[] a = new A[5];
		a[0] = new A(10);
		a[1] = new A(20);
		a[2] = new A(30);
		a[3] = new A(40);
		a[4] = new A(50);
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}

	}
}
