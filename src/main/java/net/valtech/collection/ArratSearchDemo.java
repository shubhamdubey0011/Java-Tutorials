package net.valtech.collection;

import java.util.Arrays;

public class ArratSearchDemo {

	public static void main(String[] args) 
	{
	
		int[] a={10,5,20,11,6};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a,6));//1
		System.out.println(Arrays.binarySearch(a,14));//-5
		String[] s={"A","Z","B"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s,"Z"));//2
		System.out.println(Arrays.binarySearch(s,"S"));//-3
		Arrays.sort(s,new Compdemo());
		System.out.println(Arrays.binarySearch(s,"Z",new Compdemo()));//0
		System.out.println(Arrays.binarySearch(s,"S",new Compdemo()));//-2
		System.out.println(Arrays.binarySearch(s,"N"));//-4(unpredictable result)

		
		
		
	}
}
