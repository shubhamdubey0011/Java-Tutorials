package Java.lang.Package;

public class HashCodeDemo {

	int rollno;

	HashCodeDemo(int rollno) {

		this.rollno = rollno;
	}

	// overridden hashcode method
	// public int hascode() {
	// return rollno;
	// }

	public static void main(String[] args) {

		HashCodeDemo hsd1 = new HashCodeDemo(10);
		HashCodeDemo hsd2 = new HashCodeDemo(20);
		HashCodeDemo hsd4=hsd1;
		
		System.out.println(hsd1.equals(hsd2));
		System.out.println(hsd1 == hsd2);
		System.out.println("================================================");
		System.out.println(hsd1.equals(hsd4));
		System.out.println(hsd1 == hsd4);
		System.out.println("================================================");
		System.out.println(hsd1.hashCode());
		System.out.println(hsd2.hashCode());
		System.out.println(hsd4.hashCode());
		System.out.println("================================================");
		System.out.println(hsd1.hashCode()==hsd4.hashCode());
		System.out.println(hsd1.equals(hsd4));
		System.out.println("================================================");
		System.out.println(hsd1.hashCode()==hsd2.hashCode());
		System.out.println(hsd1.equals(hsd2));
		
		
	}

}
