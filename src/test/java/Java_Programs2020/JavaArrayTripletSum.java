package Java_Programs2020;

import java.util.Arrays;

public class JavaArrayTripletSum {
public static void main(String[] args) {
    getArrayTripletSum(new int[] {7, 5, 9, 3, 0, 8, 6}, 12);
}

private static void getArrayTripletSum(int[] inputArray,int sum)
{
    System.out.println("Input Array : "+Arrays.toString(inputArray));
    System.out.println("Given Number : "+sum);
    
    System.out.println("Array triplets whose sum is "+sum+" are :");
    for (int i = 0; i < inputArray.length-2; i++) {
        for (int j = i+1; j < inputArray.length-1; j++) {
            for (int k = j+1; k < inputArray.length; k++) {
                if (inputArray[i]+inputArray[j]+inputArray[k] == sum) {
                    System.out.println("["+inputArray[i]+", "+inputArray[j]+", "+inputArray[k]+"]");  
                }
            }
        }
    }
    
    
    
    
}
}
