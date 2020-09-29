package Java_1_8_Features;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> strarray = new ArrayList<String>();
        strarray.add("Satyam");
        strarray.add("aatyam");
        strarray.add("Patyam");
        strarray.add("atyam");
        strarray.add("bob");

        System.out.println("Using normal for loop and if else approach::" + countOfNameWithA(strarray));

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        System.out.println("Streams filter option from jave 1.8 ::" + streamFilterExample(strarray));

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        streamFilterExample_1();

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        streamFilterExample_2(strarray);

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        streamFilterExample_3();

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        streamFilterExample_4();
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        streamFilterExample_5();
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        streamFilterExample_6();

        System.out.println("::::::::::::::::::::::::::::::::::::::ASSIGNMENT:::::::::::::::::::::::::::::::::");

        assignment();

    }

    public static int countOfNameWithA(List<String> strarray) {
        int strlngth = strarray.size();
        int count = 0;
        for (int i = 0; i < strlngth; i++) {
            if (strarray.get(i).startsWith("a")) {
                count++;
            }
        }
        return count;
    }
//to get the strings starts from "a"
    public static long streamFilterExample(List<String> strarray) {
        long count = strarray.stream().filter(s -> s.startsWith("a")).count();

        return count;

    }

    // Using light weight stream interface
    public static void streamFilterExample_1() {
        long d = Stream.of("satyam", "shubham", "shivam", "mamta", "susheel", "sunil", "shreya", "bob", "pop")
                .filter(s -> {
                    s.startsWith("a");
                    return true;
                }).count();
        System.out.println("Count is " + d);
    }

    // filters Using foreach method
    public static void streamFilterExample_2(List<String> strarray) {
        strarray.stream().filter(s -> s.length() > 4).limit(4)
                .forEach(s -> System.out.println("Using for each Method with filters::" + s));
    }

    // filter with forEach() & Map Method
    public static void streamFilterExample_3() {
        Stream.of("satyam", "shubham", "shivam", "mamta", "susheel", "sunil", "shreya", "bob", "pop")
                .filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
                .forEach(s -> System.out.println("Using for each Method with filters::" + s));
    }

    // filter with sorting example
    public static void streamFilterExample_4() {

        Arrays.asList("Satyam", "Shivam", "aaraya", "esha", "isha").stream().filter(s -> s.length() > 1).sorted()
                .forEach(s -> System.out.println("*****************" + s));
    }

    // merging to array list
    public static void streamFilterExample_5() {

        List<String> array1 = Arrays.asList("Satyam", "Shivam", "aaraya", "esha", "isha");
        List<String> array2 = Arrays.asList("Dubey", "Tiwari", "Mishra", "sharma", "bharadwaj");

        Stream<String> newstream = Stream.concat(array1.stream(), array2.stream());
        newstream.sorted().forEach(s -> System.out.print(" " + s));
    }

    // anymatch() Method usage
    public static void streamFilterExample_6() {

        List<String> array2 = Arrays.asList("Dubey", "Tiwari", "Mishra", "sharma", "bharadwaj");

        System.out.println(array2.stream().anyMatch(s -> s.equalsIgnoreCase("dubey")));
    }

    // streamCollect() method usage
    public static void streamFilterExample_7() {

        List<String> array2 = Arrays.asList("Dubey", "Tiwari", "Mishra", "sharma", "bharadwaj");

        List<String> list = array2.stream().filter(s -> s.endsWith("y")).collect(Collectors.toList());
        System.out.println(list);
    }

    // Print unique numbers
    // sort the array
    public static void assignment() {

        List<Integer> intarray = Arrays.asList(3, 4, 2, 2, 9, 1, 7, 9, 3, 6);

        // intarray.stream().sorted().collect(Collectors.toSet()).forEach(s->System.out.print("
        // "+s));;

        intarray.stream().distinct().sorted().forEach(s -> System.out.print(" " + s));

    }
}
