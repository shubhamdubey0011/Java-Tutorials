package net.valtech.lab;

import java.util.HashMap;
import java.util.Set;

public class RepeatativeCharCount {
    public static void main(String[] args) {
        String str = "aabaddeb";
        HashMap< Character,Integer> mapcount = new HashMap<Character,Integer >();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (mapcount.containsKey(c)) {
                mapcount.put(c,mapcount.get(c) + 1 );
            } else {
                mapcount.put(c, 1);
            }

        }
        
        Set<Character> charInstring = mapcount.keySet();
        for (Character characters : charInstring) {
            if (mapcount.get(characters)>1) {
                System.out.println(characters +" : "+ mapcount.get(characters));
            }
        }

    }
}
