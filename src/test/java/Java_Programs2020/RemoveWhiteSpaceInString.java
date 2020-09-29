package Java_Programs2020;

public class RemoveWhiteSpaceInString {
    public static void main(String[] args) {
        String inputString="Hello   How     high are                  you";
        
      //String stringwithoutSpace = inputString.replaceAll("\\s+", " ");
        
        char[] chararray = inputString.toCharArray();
        for (int i = 0; i < chararray.length; i++) {
            if ((chararray[i]==' ')&&(chararray[i]=='"\t\')) {
                    
                
            } 
        }
      System.out.println(stringwithoutSpace);
    }

}
