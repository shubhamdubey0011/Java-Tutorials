package net.valtech.Strings;

import java.util.Scanner;

public class NoOfRepeatedChar

{

   public static void main(String []args)

   {

//input through key board

Scanner sc = new Scanner(System.in);

System.out.println("Enter a string :");

String s1= sc.nextLine();


    //formatting String to char array

    String s2=s1.replace(" ","");
    char [] ch=s2.toCharArray();

    int counter=0;

    //for-loop tocompare first character with the whole character array

    for(int i=0;i<ch.length;i++)
    {
        int count=0;

        for(int j=0;j<ch.length;j++)
        {
             if(ch[i]==ch[j])
                count++; //if character is matching with others
        }
        if(count>1)
        {
            boolean flag=false;

            //for-loop to check whether the character is already refferenced or not 
            for (int k=i-1;k>=0 ;k-- )
            {
                if(ch[i] == ch[k] ) //if the character is already refferenced
                    flag=true;
            }
            if( !flag ) //if(flag==false) 
                counter=counter+1;
        }
    }
    if(counter > 0) //if there is/are any repeating characters
            System.out.println("Number of repeating charcters in the given string is/are " +counter);
    else
            System.out.println("Sorry there is/are no repeating charcters in the given string");
    }
}
