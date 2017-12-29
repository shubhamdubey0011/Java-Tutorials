/*•	Once we created an array every element is always initialized with default values 
 * irrespective of whether it is static or instance or local array.*/
package net.comcast.java;

public class Test 
{
	//static int[] a;
	//int[] a;
	//int[] a=new int[3];
	//static int[] a=new int[3];
	public static void main(String[] args) 
	{
		int[] a=new int[3];
		//Test t1=new Test();
		System.out.println(a);
		System.out.println(a[0]);
	}

}
