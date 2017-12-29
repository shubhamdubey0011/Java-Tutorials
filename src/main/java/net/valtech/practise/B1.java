package net.valtech.practise;

abstract class B1
{

	abstract void add1();

	void add() {
		System.out.println("from method add ");

	}

}

class D1 extends B1 {

	void add1() {

		System.out.println("from add1 method");
	}
	
	public static void main(String[] args) 
	{
	D1 d = new D1();
	d.add1();
		
	}

}