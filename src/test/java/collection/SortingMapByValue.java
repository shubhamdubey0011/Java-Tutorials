package collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class SortingMapByValue {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Shubham", 10);
		map.put("maidul", 30);
		map.put("Abhinav", 20);
		map.put("reshin", 50);
		map.put("vipul", 40);
		System.out.println("Unsorted ::" + map);

		TreeMap<String, Integer> sortedMap = sortedMapByValue(map);
		System.out.println("sorted ::" + sortedMap);

	}

	public static TreeMap<String, Integer> sortedMapByValue(
			HashMap<String, Integer> map) {

		Comparator<String> comparator = new ValueComparator(map);

		TreeMap<String, Integer> result = new TreeMap<String, Integer>(
				comparator);
		result.putAll(map);
		return result;
	}

}

class ValueComparator implements Comparator<String> {

	HashMap<String, Integer> map = new HashMap<String, Integer>();

	public ValueComparator(HashMap<String, Integer> map) {
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



