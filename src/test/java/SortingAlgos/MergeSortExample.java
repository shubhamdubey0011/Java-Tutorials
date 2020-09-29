package SortingAlgos;

import java.util.Arrays;

public class MergeSortExample {
    public static void main(String[] args) {
        int[] arr = {43, 39, 54, 61, 81, 55, 92, 7, 0, 15, 112, 10};
        System.out.println("Original array- " + Arrays.toString(arr));
        MergeSortExample ms = new MergeSortExample();
        ms.mergeSortRecursive(arr, 0, arr.length-1);
        System.out.println("Sorted array after merge sorting- " + Arrays.toString(arr));
    }
    
    
    private void mergeSortRecursive(int[] arr, int start, int end){
      //base case
        if (start == end){
            return;
        }else {
         // Middle point of the array
            int middle = (start + end)/2;  
            // divide array into two parts using middle point
            mergeSortRecursive(arr, start, middle);        
            mergeSortRecursive(arr, middle+1, end);
            
            
    }
        

}
    
    private void merge(int[] arr, int start, int middle, int end){
        int temArray1Length = middle - start + 1;
        int temArray2Length = end - middle;
        int[] temp1 = new int[temArray1Length];
        int[] temp2 = new int[temArray2Length];
        for(int i = 0; i < temArray1Length; i++){
            temp1[i] = arr[start + i];
        }
        for(int j = 0; j < temArray2Length; j++){
            temp2[j] = arr[middle + 1 + j];
        }
        
     // merging process, merge two temp arrays put the 
        // sorted elements in original array 
        while((i < temArray1Length) && (j < temArray2Length)){
            if(temp1[i] < temp2[j]){
                arr[start] = temp1[i++];
            }else{
                arr[start] = temp2[j++];
            }
            start++;
        }
        // Add left over elements from temp arrays
        while(i < temArray1Length){
            arr[start++] = temp1[i++];
        }
        while(j < temArray2Length){
            arr[start++] = temp2[j++];
        }
        
    }
}
