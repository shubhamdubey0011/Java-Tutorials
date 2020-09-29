package Java_Programs2020;

public class sortIntArray {
public static void main(String[] args) {
    int [] intarry= {8,11,89,19,67,23};
    int temp;
    for (int i = 0; i < intarry.length; i++) {
        for (int j = i+1; j < intarry.length; j++) {
            if (intarry[i]>intarry[j]) {
                temp=intarry[i];
                intarry[i]=intarry[j];
                intarry[j]=temp;
                
            }
            
        }
        System.out.print(intarry[i]+ " ");
    }
    
}
}
