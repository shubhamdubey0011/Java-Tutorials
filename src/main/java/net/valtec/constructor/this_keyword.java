package net.valtec.constructor;

class sample {

	private int x;

	sample() {
		this(55);//this calling statment
		this.acces();//this keyword
	}

	sample(int x) 
	{
		this.x = x;

	}

	void acces() {
		System.out.println("x=" + x);
	}
}

public class this_keyword {

	public static void main(String[] args) {

		sample s1 = new sample();
		

	}
}
