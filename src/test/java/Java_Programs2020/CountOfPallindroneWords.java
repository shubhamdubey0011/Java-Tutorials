package Java_Programs2020;

public class CountOfPallindroneWords {
public static void main(String[] args) {
    String input="choodu";
    String reverse="";
    char[] chararray = input.toCharArray();
    for (int i =chararray.length-1 ; i >=0 ; i--) {
                            reverse=reverse+chararray[i];     
                            
    }
    if (input.equalsIgnoreCase(reverse)) {
        System.out.println("it is boolean");
    }
    else
    System.out.println("it is non-boolean");
    
}
}
