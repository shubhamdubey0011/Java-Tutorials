package net.valtech.lab;

public class thirdLargestNumber {
public static void main(String[] args) {
    int[] intarray= {10, 2, 5, 4, 6, 17, 11, 22};
    System.out.println(findThirdLargest(intarray));
}

private static int findThirdLargest(int[] intarray)
{
     int firstlargest=intarray[0], secondLargest=Integer.MIN_VALUE,thirdLagest=Integer.MIN_VALUE;
     
     for (int i = 0; i < intarray.length; i++) {
        if (intarray[i]>firstlargest) {
            thirdLagest=secondLargest;           
            secondLargest=firstlargest;
            firstlargest=intarray[i];
    }
        else if(intarray[i]>secondLargest) 
        {
            thirdLagest=secondLargest;    
            secondLargest=intarray[i];
        }
        else if (intarray[i]>thirdLagest) {
            thirdLagest=intarray[i];
            
        }
     }
    return thirdLagest;
    }
}
