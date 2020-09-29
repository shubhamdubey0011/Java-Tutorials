package net.JavaPrograms.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicatesUsing {
    public static void main(String[] args) {

        int[] inputArray = new int[] { 111, 333, 555, 777, 333, 444, 555 };
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    System.out.println("duplicate elemnet is" + inputArray[i]);
                }
            }
        }
    }
}
