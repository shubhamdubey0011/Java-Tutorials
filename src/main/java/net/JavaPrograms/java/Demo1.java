package net.JavaPrograms.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {

        int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49, 25 };
        // System.out.println(findindex(my_array, 56));
        // insertElementAtindex(my_array, 10, 2);
        System.out.println(findMax(my_array));
        // System.out.println(findMin(my_array));
        // findduplicates(my_array);
         fibonacci();
        // pallindroneNumber();
        // pallindroneWord();
        // frequencyOfANumber();
        
        reverseEachWord("Java my love");
    }

    static int i = 0;

    static int findindex(int[] my_array, int element) {
        for (i = 0; i < my_array.length; i++) {
            if (my_array[i] == element)
                return i;
        }
        return i;
    }

    static int findMax(int[] my_array) {

        int max = my_array[0];
        for (int i = 0; i < my_array.length - 1; i++) {
            if (my_array[i] > max) {
                max = my_array[i];
            }
        }
        return max;
    }

    static int findMin(int[] my_array) {

        int temp = 0;
        int min = my_array[0];
        for (int i = 2; i < my_array.length - 1; i++) {
            if (my_array[i] < min) {
                min = my_array[i];
            }
        }
        return min;
    }

    static void insertElementAtindex(int[] my_array, int element, int index) {

        for (i = 0; i < my_array.length; i++) {
            if (i == index)
                my_array[i] = element;
        }

        System.out.println(Arrays.toString(my_array));
    }

    static void findduplicates(int[] my_array) {

        for (i = 0; i < my_array.length; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if (my_array[i] == my_array[j] && (i != j)) {
                    System.out.println("Duplicate numbers are " + my_array[i]);
                }
            }
        }

    }

    static void fibonacci() {

        int a = 0, b = 1, c, count = 20;

        System.out.print(a + " " + b);
        for (int i = 0; i < count; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

    }

    static void pallindroneNumber() {
        int number = 786;
        String copyofnumber = Integer.toString(number);
        String revereseNumber = "";
        for (int i = copyofnumber.length() - 1; i >= 0; i--) {
            revereseNumber = revereseNumber + copyofnumber.charAt(i);
        }
        if (copyofnumber.equals(revereseNumber)) {
            System.out.println(number + " is palindrone");
        } else
            System.out.println(number + " is not palindrone");

    }

    static void pallindroneWord() {
        String word = "nitin";
        int count = word.length();
        String revereseWord = "";
        for (int i = count - 1; i >= 0; i--) {
            revereseWord = revereseWord + word.charAt(i);
        }
        if (word.equals(revereseWord)) {
            System.out.println(word + " is palindrone");
        } else
            System.out.println(word + " is not palindrone");

    }

    static void frequencyOfANumber() {
        int number = 21757132;
        String numberINString = Integer.toString(number);
        char[] numchararray = numberINString.toCharArray();

        HashMap<Character, Integer> numberfreqMap = new HashMap<Character, Integer>();

        for (char c : numchararray) {
            if (numberfreqMap.containsKey(c)) {
                numberfreqMap.put(c, numberfreqMap.get(c) + 1);
            } else {

                numberfreqMap.put(c, 1);
            }
        }
        // Using key for printing frequency of duplicate numbers
        /*
         * Set<Character> setofgigit = numberfreqMap.keySet(); for (Character character
         * : setofgigit) { if (numberfreqMap.get(character) > 1) {
         * System.out.println(character + " ::" + numberfreqMap.get(character)); } }
         */
        Set<Entry<Character, Integer>> setofgigit = numberfreqMap.entrySet();
        setofgigit.stream().forEach(s -> System.out.println(s));

    }

    static void reverseEachWord(String inputString) {
        String[] words = inputString.split(" ");

        String reverseString = " ";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseword = " ";
            for (int j = word.length() - 1; j >= 0; j--) {
                                 reverseword+= word.charAt(j);
            }
                                 reverseString+=reverseword+" ";
        }
System.out.println(reverseString);
    }

}
