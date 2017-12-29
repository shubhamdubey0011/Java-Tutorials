//Static block flow control
package net.valtech.practise;

class Base {
	static int i = 10;

	static {
	
		methodOne();
		System.out.println("Base class static blocl");

	}

	public static void main(String[] args) {
		methodOne();
		System.out.println("Base class main method");

	}

	public static void methodOne() {

		System.out.println("J's initial value" + j);

	}

	static int j = 20;
}

class Derived extends Base {

	static int x = 100;
	static {

		methodTwo();
		System.out.println("Derived class static blcok ");
	}

	public static void main(String[] args) {

		methodTwo();
		System.out.println("Derived class main ");

	}

	public static void methodTwo() {
		System.out.println("inital value of y  " + y);

	}

	static {
		System.out.println("derived class 2nd static block");
	}
	static int y = 200;
}
