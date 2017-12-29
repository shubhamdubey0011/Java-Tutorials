package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList arry = new ArrayList();
		for (int i = 0; i <= 10; i++) {

			arry.add(i);
		}
		System.out.println(arry);

		Iterator itr = arry.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
