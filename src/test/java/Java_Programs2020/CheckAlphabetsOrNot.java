package Java_Programs2020;

public class CheckAlphabetsOrNot {
    
    public static void main(String[] args) {
 System.out.println(ischaracter());
        
    }
    static boolean ischaracter()
    {
        String str="9879799";
        char[] chrarray = str.toCharArray();
        char ch;
        boolean isCharacter=true;
        for ( char ch1 : chrarray) {
        if((ch1>='a' && ch1<='z') || (ch1>='A' && ch1<='Z'))
        {
           isCharacter=true;
        }
        else
        {
            isCharacter=false;
        }
        
    }
        return isCharacter;
    }
}
