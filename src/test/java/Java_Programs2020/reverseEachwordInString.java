package Java_Programs2020;

public class reverseEachwordInString {
public static void main(String[] args) {
    String str= "reverse word";
    System.out.println(reverseEachWord(str));
    
    
}
 public static String reverseEachWord(String Str)
 {
     String reverseString="";
    String[] strarry = Str.split(" ");
     for (int i = 0; i < strarry.length; i++) {
         String word = strarry[i];
         String reverseword="";
         
         for (int j = word.length()-1; j >=0; j--) {
                 reverseword=reverseword+word.charAt(j);
             
        }
         
         reverseString=reverseString+reverseword+" ";
    }
     
     
    return reverseString;
     
 }

}
