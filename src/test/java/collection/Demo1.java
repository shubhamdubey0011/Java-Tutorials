package collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Shubham", 10);
		map.put("maidul", 30);
		map.put("Abhinav", 20);
		map.put("reshin", 50);
		map.put("vipul", 40);
		System.out.println("Unsorted ::" + map);

		TreeMap<String, Integer> sorted = sortedMapByValue(map);
		System.out.println(sorted);

	}

	private static TreeMap<String, Integer> sortedMapByValue(
			HashMap<String, Integer> map) {

		Comparator comparator = new ValueComparators(map);
		TreeMap<String, Integer> results = new TreeMap<String, Integer>(
				comparator);
		results.putAll(map);
		return results;

	}

}

class ValueComparators implements Comparator<String> 
{

	HashMap<String, Integer> map = new HashMap<String, Integer>();

	public ValueComparators(HashMap<String, Integer> map) {
		this.map.putAll(map);
	}

	public int compare(String s1, String s2) {
		if (map.get(s1) > map.get(s2)) {
			return +1;
		} else {
			return -1;
		}
	}

}