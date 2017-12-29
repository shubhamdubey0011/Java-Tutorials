package net.valtech.practise;

import java.util.Scanner;

class CountTheWords {
	public static void main(String[] args) {
          //using simple split method
		
		
		//1.
		/*
		 * String GOT = "shubham";
		 * 
		 * String[] words = GOT.trim().split("");
		 * 
		 * System.out.println("Number of words in the string = " +
		 * words.length);
		 */
		
		//2.
		// using scanner class
		/*
		 * System.out.println("Enter the string");
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String s=sc.nextLine();
		 * 
		 * String[] words1 = s.trim().split(" ");
		 */
		
		
		
		//3.  
        String s="Nelson Mandella"; 
 
        int count = 1;
 
        for (int i = 0; i < s.length()-1; i++)
        {
            if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
            {
                count++;
            }
        }
 
        System.out.println("Number of words in a string = "+count);
    }

	}
