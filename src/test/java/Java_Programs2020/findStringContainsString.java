package Java_Programs2020;

public class findStringContainsString {
public static void main(String[] args) {
   String s1="JavaHello" ; 
   String s2="fuckUJava"; 
   
   if (s1.length()!= s2.length()) 
   {
    System.out.println("Not Possible Error");
}   else 
   {
 String s3=s1+s2;
 if (s3.contains(s2)) {
    System.out.println("s2 is the rotated version of s3");
}
 else {
     System.out.println("no s2 is not the rotated version of s3");
 }
}
}
}
