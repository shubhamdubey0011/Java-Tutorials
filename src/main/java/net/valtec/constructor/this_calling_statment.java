package net.valtec.constructor;

class sample2 {

	sample2() {
		System.out.println("from sample2()");
	}

	sample2(int a) {
		this();
		System.out.println("from sample2(int a)");
	}

	sample2(double d) {
		this(90);
		System.out.println("from sample2(double d)");
	}

	sample2(int a, double d) {
		this(90.5);
		System.out.println("from sample2(int a,double d)");
	}

}

public class this_calling_statment 
{
public static void main(String[] args) 
{

	sample2 s2 = new sample2(19,19.9);
	
	
}
}
