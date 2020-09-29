package SortingAlgos;

import java.util.Arrays;

public class InsertionSort {
public static void main(String[] args) {
    int[] arr = {25, 34, 10, 7, 15, 92, 53, 72, 39, 45};
    System.out.println("Original array- " + Arrays.toString(arr));
    int[] sortedArray = insertionSort(arr);      
    System.out.println("Sorted array- " + Arrays.toString(sortedArray));
}

private static int[] insertionSort(int[] arr)
{
    int n = arr.length;
    int j ;
    for (int i = 1; i < n; i++) {
        int temp = arr[i];
        j=i;
        while(j > 0 && arr[j - 1] > temp){
            // shift elements to right
            arr[j] = arr[j - 1];
            --j;
        }
        arr[j] = temp;
    }
    return arr;
    
}
}
