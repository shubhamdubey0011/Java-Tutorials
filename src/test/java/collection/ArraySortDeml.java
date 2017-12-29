package collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortDeml {

	public static void main(String[] args) {

		int a1[] = { 10, 13, 14, 12 };
		for (int i : a1) {
			System.out.println(i);
		}
		System.out.println("++++++++++");
		Arrays.sort(a1);

		for (int i : a1) {
			System.out.println(i);
		}
		System.out.println(Arrays.binarySearch(a1, 14));

		System.out.println("++++++++++");

		System.out.println("++++++++++");
		String str[] = { "A", "N", "G", "Z" };
		for (String s1 : str) {
			System.out.println(s1);
		}
		System.out.println("++++++++++");
		Arrays.sort(str);
		for (String s1 : str) {
			System.out.println(s1);
		}
		System.out.println("++++++++++");
		Arrays.sort(str, new MyArraycompartor());
		for (String s1 : str) {
			System.out.println(s1);
		}

		System.out.println(" Binary search result ::"+Arrays.binarySearch(str, "N", new MyArraycompartor()));

	}
}

class MyArraycompartor implements Comparator {

	public int compare(Object o1, Object o2) {

		String s1 = (String) o1;
		String s2 = (String) o2;
		return s2.compareTo(s1);

	}

}
