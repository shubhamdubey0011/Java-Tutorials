package collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

class ComparatorDemo {
	public static void main(String[] args) {

		// System.out.println("A".compareTo("Z"));
		// System.out.println("Z".compareTo("K"));

		// treeset
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(20);
		System.out.println(ts);

	}
}

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {

		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;

		if (i1 < i2)
			return +1;
		else if (i1 > i2)
			return -1;
		else
			return 0;

	}
}