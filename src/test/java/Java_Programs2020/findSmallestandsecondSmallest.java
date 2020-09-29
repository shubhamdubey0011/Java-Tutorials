package Java_Programs2020;

import java.util.Arrays;

public class findSmallestandsecondSmallest {
    public static void main(String[] args) {
        int[] array = { 17, 11, 23, 64, 41, 88, 35 }; // 17 & 11

        int firstsmallest = array[0], secondsmallest = array[1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstsmallest) {
                secondsmallest = firstsmallest;
                firstsmallest = array[i];
            } else if ((array[i] > firstsmallest) && (array[i] < secondsmallest)) {
                secondsmallest = array[i];
            }
        }
        System.out.println("Input Array : " + Arrays.toString(array));

        System.out.println("Smallest Element : " + firstsmallest);

        System.out.println("Second Smallest Element : " + secondsmallest);

    }
}
