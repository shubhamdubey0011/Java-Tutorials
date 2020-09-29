package net.valtech.lab;

import java.util.ArrayList;
import java.util.List;

public class CountOfNumbersNonNumbers {
    public static void main(String[] args) {
        String string[] = { "Raj", "77", "101", "99", "Jio" };
        countOfNumberNonNumber(string);

    }

    private static void countOfNumberNonNumber(String[] string) {
        int cn = 0, cs = 0;

        for (int i = 0; i < string.length; i++) {
            try {
                int j = Integer.parseInt(string[i]);
                cn++;
            } catch (NumberFormatException e) {
                cs++;
            }
        }
        System.out.println("Numeric:" + cn + "\nStrings:" + cs);
    }

}
