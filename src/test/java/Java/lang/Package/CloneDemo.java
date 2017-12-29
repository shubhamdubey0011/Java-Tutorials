package Java.lang.Package;

public class CloneDemo implements Cloneable
{

	int i=10;
	int j=20;
	public static void main(String[] args) throws CloneNotSupportedException
	{
	
		CloneDemo cd1 =	new CloneDemo();
		 CloneDemo cd2 = (CloneDemo)cd1.clone();//deep clonning
		 CloneDemo cd3 = cd2;//swallow clonning
		 cd2.i=222;
		 cd2.j=333;
		 System.out.println(cd1.i+"............."+cd1.j);
		 System.out.println(cd2.i+"............."+cd2.j);
		
		 
		 
		
	}
}
