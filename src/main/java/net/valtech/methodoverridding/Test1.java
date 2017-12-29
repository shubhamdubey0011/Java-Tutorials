package net.valtech.methodoverridding;

class Base 
{
	// Static method in base class which will be hidden in subclass
	public static void display() 
	{
		System.out.println("Static or class method from Base");
	}

	// Non-static method which will be overridden in derived class
	public void print() 
	{
		System.out.println("Non-static or Instance method from Base");
	}
}

class Derived extends Base {
	// This method hides display() in Base
	public static void display() {
		System.out.println("Static or class method from Derived");
	}

	// This method overrides print() in Base
	public void print() {
		System.out.println("Non-static or Instance method from Derived");
	}
}

public class Test1 {
	public static void main(String args[]) {
		Base obj1 = new Derived();
		// As per overriding rules this should call to class Derive's static
		// overridden method. Since static method can not be overridden, it
		// calls Base's display()
		obj1.display(); // output -> Static or class method from Base
		// Here overriding works and Derive's print() is called
		obj1.print(); // output-> Non-static or Instance method from Derived
	}
}
