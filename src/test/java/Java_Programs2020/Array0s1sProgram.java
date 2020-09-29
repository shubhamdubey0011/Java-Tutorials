package Java_Programs2020;

import java.util.Arrays;

public class Array0s1sProgram {
    public static void main(String[] args) {
        sortArray(new int[] { 1, 0, 1, 1, 0, 1, 0, 0 });
    }

    static int zerosCount = 0;

    private static void sortArray(int[] arr) {

        System.out.println("Input Array Before Sorting " + Arrays.toString(arr));
      //Counting the zeroes.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zerosCount++;
            }
        }
      //Rewriting the array with 0s...
        for (int i = 0; i < zerosCount; i++) {
            arr[i] = 0;
        }
        //... and remaining places with 1s
        for (int i = zerosCount; i < arr.length; i++) {
            arr[i] = 1;
        }

        System.out.println("Input Array After Sorting : " + Arrays.toString(arr));
    }
}
