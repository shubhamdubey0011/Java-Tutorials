package Java_1_8_Features;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        ArrayList<Integer> arraylist = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++)
            arraylist.add(i);

        // sequential stream
        Stream<Integer> sequentialStream = arraylist.stream();

        // parallel stream
        Stream<Integer> parallelStream = arraylist.parallelStream();
        
        arraylist.forEach((n)->System.out.println("iterating using for each method::"+n));
        
        
        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p <100);
        highNumsSeq.forEach(p -> System.out.println("High Nums sequential filters="+p));


        Stream<Integer> highnums = parallelStream.filter(p ->p>90);
        highnums.forEach(p -> System.out.println("High Nums parallel filters=" + p));

        
    }
}
