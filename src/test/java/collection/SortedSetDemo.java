package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {

		
		// SortedSet sort = new SortedSet();
		// Set sort1 = new SortedSet();
		// TreeSet sort = new SortedSet();
		
		// Create a TreeSet and inserting elements
		SortedSet<String> sites = new TreeSet<String>();
		sites.add("practice");
		sites.add("geeksforgeeks");
		sites.add("quiz");
		sites.add("code");

		System.out.println("Sorted Set: " + sites);//practise geeksforgeeks quiz code
		System.out.println("First: " + sites.first());//practise
		System.out.println("Last: " + sites.last());//code

		// Getting elements before quiz (Excluding) in a sortedSet
		SortedSet<String> beforeQuiz = sites.headSet("quiz");
		System.out.println(beforeQuiz);//practise geeksforgeeks

		// Getting elements between code (Including) and
		// practice (Excluding)
		SortedSet<String> betweenCodeAndQuiz = sites.subSet("code", "practice");
		System.out.println(betweenCodeAndQuiz);//geeksforgeeks,qiz

		// Getting elements after code (Including)
		SortedSet<String> afterCode = sites.tailSet("code");
		System.out.println(afterCode);//null
	}
}