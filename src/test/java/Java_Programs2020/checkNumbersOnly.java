package Java_Programs2020;

public class checkNumbersOnly {
public static void main(String[] args) {
    
    
    String str="999999";
    String str1="ello";
    try {
        int inti = Integer.parseInt(str1);
        System.out.println(inti);
        
    } catch (NumberFormatException e) {
        System.out.println("kindly enter number only");
    }
   
}
}
