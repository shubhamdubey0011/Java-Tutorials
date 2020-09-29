package Java_Programs2020;

public class missingElement {
public static void main(String[] args) {
    int[] arr = {  2, 3, 4, 5, 7, 8, 9, 10 };
       int expectedNum=arr.length+1;
       System.out.println(expectedNum);
               int expectedSum= expectedNum*(expectedNum+1)/2;
               System.out.println(expectedSum);
                int currentSum=0;
               for (int i : arr) {
                            currentSum+=i;               
            }
               System.out.println(currentSum);
    System.out.println(currentSum-expectedSum);
}
}
