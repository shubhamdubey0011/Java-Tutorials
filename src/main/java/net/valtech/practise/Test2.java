package net.valtech.practise;

public class Test2 {

	public static int age;

	public static int code;

	public static void main(String[] args) {

		Test2 t1 = new Test2();
		t1.age = 20;
		t1.code = 200;

		Test2 t2 = new Test2();
		t2.age = 30;
		t2.code = 300;

		System.out.println(t1.age);
		System.out.println(t1.code);
		System.out.println(t2.age);
		System.out.println(t2.code);

	}

}
