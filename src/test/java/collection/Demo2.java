package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(15);
		al.add(0);
		al.add(20);
		al.add(10);
		al.add(5);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(" reverse" + al);
		Collections.reverseOrder();
		System.out.println(" reverse Order" + al);

	}
}
