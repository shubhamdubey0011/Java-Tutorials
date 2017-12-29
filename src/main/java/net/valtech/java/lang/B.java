package net.valtech.java.lang;

public class B {

	int age;

	B(int age) {
		this.age = age;
	}

	
	
	public boolean  hashcode()
	{
		return true;
		
	}
	public boolean equals(Object obj) {
		B b1 = (B) obj;
		if (this.age == b1.age) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		B rv1 = new B(23);
        B rv2 =new B(24);
        		
   
		//B rv2 =rv1;
		
		System.out.println(rv1 == rv2);
		System.out.println(rv1.hashCode() == rv2.hashCode());
		System.out.println(rv1.equals(rv2));
		System.out.println(rv1.hashCode());
		System.out.println(rv2.hashCode());

	}
}
