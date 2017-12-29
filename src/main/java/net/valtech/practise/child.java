package net.valtech.practise;

class Parent {

	int x = 10;

	{
		methodOne();
		System.out.println("1st instance block of parent class");

	}

	Parent() {
		System.out.println("Parent class constructor");
	}

	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.println("Parent class main method");

	}

	public void methodOne() {
		System.out.println(y);
	}

	{
		System.out.println("second instance block of parent class ");
	}
	int y = 20;
}

class child extends Parent {
	int x = 10;

	{
		methodTwo();
		System.out.println("1st instance block");

	}

	child() {

		System.out.println("child class constaructor");
	}

	public static void main(String[] args) {
		child child = new child();
		System.out.println("main method of class child");
	}

	public void methodTwo() {
		System.out.println(j);
	}

	{
		System.out.println("second instance block");
	}

	int j = 200;
}
