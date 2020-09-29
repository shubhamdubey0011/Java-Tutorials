package Java_Programs2020;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class findDuplicateInArray {
    public static void main(String[] args) {
        int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555};
        findDuplicate(inputArray);
   
    }

   static   void findDuplicate(int array[]) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int element : array) {
            if (map.get(element) == null) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out
                        .println("Duplicate Element : " + entry.getKey() + " - found " + entry.getValue() + " times.");
            }
        }
    }

}
