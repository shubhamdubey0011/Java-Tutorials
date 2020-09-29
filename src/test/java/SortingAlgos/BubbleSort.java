package SortingAlgos;

public class BubbleSort {
public static void main(String[] args) {
    int[] arr= {6,3,10,7,1};
    bubbleSort(arr);
}

    public static void bubbleSort(int[] arr)
    {
        int temp;
       for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
            if (arr[i]<arr[j]) {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        System.out.println(arr[i]+" ");
    }        
    }
    
    

}
