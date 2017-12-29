package Java.lang.Package;

public class ToStringDemo {
	String name;
	int rollno;

	
	ToStringDemo(String name, int rollno) {

		this.name = name;
		this.rollno = rollno;
	}
	
	//overrdidden tostring method
	public String toString()
	{
		
		return name+"..."+rollno;
	}

	public static void main(String[] args) {

		ToStringDemo tsd1 = new ToStringDemo("Shubham", 50);
		ToStringDemo tsd2 = new ToStringDemo("Abhinav", 40);
		System.out.println(tsd1);
		System.out.println(tsd2);

	}

}
