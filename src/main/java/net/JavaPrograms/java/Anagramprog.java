package net.JavaPrograms.java;

import java.util.Arrays;

public class Anagramprog {
    public static void main(String[] args) {

        String s1 = "SiLeNt CAT";
        String s2 = "LisTen AcT";
        boolean isanagram = true;
        if (s1.replaceAll("//s", "").length() != s2.replaceAll("//s", "").length()) {
            isanagram = false;
        } else {

            char[] charrarray1 = s1.toLowerCase().toCharArray();
            char[] charrarray2 = s2.toLowerCase().toCharArray();

            Arrays.sort(charrarray1);
            Arrays.sort(charrarray2);

            isanagram = Arrays.equals(charrarray1, charrarray2);

        }

        if (isanagram) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }

    }
}
