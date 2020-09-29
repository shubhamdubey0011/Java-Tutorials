package Java_Programs2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 10, 1, 2,
         2, 3, 3, 10, 3, 4, 5, 5));
        //ArrayList<String> list = new ArrayList<String>(Arrays.asList("mom", "dad", "brother", "brother", "dad"));

// Print the Arraylist 
        System.out.println("ArrayList with duplicates: " + list);

// Remove duplicates 
        ArrayList<Integer> newList = removeduplicate(list);

// Print the ArrayList with duplicates removed 
        System.out.println("ArrayList with duplicates removed: " + newList);

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        set.addAll(list);

        list.clear();

        list.addAll(set);
        System.out.println("second implementation soution :: " + list);
    }

    static <T> ArrayList<T> removeduplicate(ArrayList<T> list) {
        ArrayList<T> newarraylist = new ArrayList<T>();

        for (T element : list) {
            if (!newarraylist.contains(element)) {
                newarraylist.add(element);
            }
        }

        return newarraylist;

    }

}
