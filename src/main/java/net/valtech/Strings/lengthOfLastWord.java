package net.valtech.Strings;

public class lengthOfLastWord
{

	public int lengthOfLastWord(final String a)
    {
       
		/*int len = 0;
 
         String a is 'final'-- can not be modified
           So, create a copy and trim the spaces from
           both sides 
        String x = a.trim();
 
        for (int i=0; i<x.length(); i++)
        {
            if (x.charAt(i)==' ')
                len = 0;
            else
                len++;
        }
 
        return len;
    }
	*/
		
		boolean char_flag = false;
        int len = 0;
        for (int i=a.length()-1; i>=0; i--)
        {
            if (Character.isLetter(a.charAt(i)))
            {
                // Once the first chracter from last
                // is encountered, set char_flag to true.
                char_flag = true;
                len++;
            }
            else
            {
                // When the first space after the characters
                // (from the last) is encountered, return the
                // length of the last word
                if (char_flag == true)
                    return len;
            }
        }
        return len;
    }
	
	
	
	
	public static void main(String[] args) 
	{
		
		String s1="Geek do";
		lengthOfLastWord lolw = new lengthOfLastWord();
		System.out.println("lenth of last word is "+ lolw.lengthOfLastWord(s1));
		
		
		
	}
}
