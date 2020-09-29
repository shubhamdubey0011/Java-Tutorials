package Java_1_8_Features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesUsingStreams {
    public static void main(String[] args) {

        //Arraylist collection
        Set<Integer> uniqueelements = new HashSet<Integer>();
        
        Set<Integer> duplicateElements = Arrays.asList(2, 6, 8, 9, 0, 4, 5, 6, 7, 8, 0).stream()
                .filter(i -> !uniqueelements.add(i)).collect(Collectors.toSet());
        
        System.out.println(duplicateElements);

    }
}
