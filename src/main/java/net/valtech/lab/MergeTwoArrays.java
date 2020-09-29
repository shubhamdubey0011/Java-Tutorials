package net.valtech.lab;

public class MergeTwoArrays {
public static void main(String[] args) {
    int[] arr1= {5,7,10,11};
    int[] arr2= {6,8,9};
    int[] temparray= new int[arr1.length+arr2.length];
    int count = 0,temp = 0;
//merging part
    for (int i = 0; i < arr1.length; i++) {
        temparray[i]=arr1[i];
        count++;
        }
    for (int i = 0; i < arr2.length; i++) {
        temparray[count++] = arr2[i];
    }
    System.out.println("unsorted array ::");
    for (int i = 0; i < temparray.length; i++) {
System.err.print(temparray[i]+ " " );        
    }
  //sorting part of he code   
    for (int i = 0; i < temparray.length; i++) 
    {
        for (int j = i + 1; j < temparray.length; j++) { 
            if (temparray[i] > temparray[j]) 
            {
                temp = temparray[i];
                temparray[i] = temparray[j];
                temparray[j] = temp;
            }
        }
    }
    System.out.print("Array Elements in Ascending Order: ");
    for (int k = 0; k < temparray.length; k++) 
    {
        System.out.print(temparray[k] + ", ");
    }
}

    
}
