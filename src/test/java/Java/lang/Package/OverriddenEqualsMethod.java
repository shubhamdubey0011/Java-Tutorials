package Java.lang.Package;

public class OverriddenEqualsMethod {

	String name;
	int rollno;

	OverriddenEqualsMethod(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public boolean equals(Object obj) {

		try {

			String name1 = this.name;
			int rollno1 = this.rollno;
			OverriddenEqualsMethod s2 = (OverriddenEqualsMethod) obj;
			String name2 = s2.name;
			int rollno2 = s2.rollno;
			if (name1.equals(name2) && rollno1 == rollno2) {
				return true;
			} else
				return false;

		} catch (ClassCastException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		OverriddenEqualsMethod tsd1 = new OverriddenEqualsMethod("Shubham", 50);
		OverriddenEqualsMethod tsd2 = new OverriddenEqualsMethod("Abhinav", 40);
		OverriddenEqualsMethod tsd3 = new OverriddenEqualsMethod("Shubham", 50);
		OverriddenEqualsMethod tsd4 = tsd1;

		System.out.println("equals() :: " + tsd1.equals(tsd2));// content
																// comprasion
		System.out.println(tsd1 == tsd2);// reference comprasion

		System.out.println("-------------------------------------");
		System.out.println("equals() :: " + tsd1.equals(tsd3));
		System.out.println(tsd1 == tsd3);

		System.out.println("-------------------------------------");
		System.out.println("equals() :: " + tsd1.equals(tsd4));
		System.out.println(tsd1 == tsd4);

	}
}
