package org.altimetrik.arrays.codes;

public class DuplicteElements {
    public static void main(String[] args) {
        String[] strArray = { "Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC" };
        for (int i = 0; i < strArray.length - 1; i++) {
            for (int j = i + 1; j < strArray.length; j++) {
                if (strArray[i].equals(strArray[j]) && (i != j)) {
                    System.out.println("Duplicate elements " + strArray[i]);
                }

            }
        }
    }
}