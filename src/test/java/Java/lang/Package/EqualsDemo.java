package Java.lang.Package;

public class EqualsDemo {

	String name;
	int rollno;

	EqualsDemo(String name, int rollno) {

		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) {

		EqualsDemo tsd1 = new EqualsDemo("Shubham", 50);
		EqualsDemo tsd2 = new EqualsDemo("Abhinav", 40);
		EqualsDemo tsd3 = new EqualsDemo("Shubham", 50);
		// System.out.println(tsd1);
		// System.out.println(tsd2);
		EqualsDemo tsd4 =tsd1;
		
		System.out.println("equals() :: "+tsd1.equals(tsd2));
		System.out.println(tsd1==tsd2);
		
		System.out.println("-------------------------------------");
		System.out.println("equals() :: "+tsd1.equals(tsd3));
		System.out.println(tsd1==tsd3);
		
		System.out.println("-------------------------------------");
        System.out.println("equals() :: "+tsd1.equals(tsd4));
        System.out.println(tsd1==tsd4);
		
		
		
		

	}
}
