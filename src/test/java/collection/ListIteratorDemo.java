package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ArrayList arry = new ArrayList();
		arry.add("Shubham");
		arry.add("Maidul");
		arry.add("prabhu");
		arry.add("Pankaj");

		System.out.println(arry);
		ListIterator litr = arry.listIterator();
		while (litr.hasNext()) {

			String s = (String) litr.next();
			if (s.equals("Shubham")) {

				litr.remove();

			}
		}
		System.out.println(arry);

	}
}
