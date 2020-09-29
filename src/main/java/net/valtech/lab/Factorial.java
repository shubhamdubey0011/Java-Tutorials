package net.valtech.lab;

import java.util.Scanner;

import org.apache.bcel.generic.RET;

public class Factorial {

    public static void main(String args[]) {
        System.out.println(factorial(4));
        int number=5,fact =1;
        for (int i = 1; i<=number; number--) {
             fact*=number;
        }
        System.out.println(fact);
    }

    static int factorial(int number) {
       
            return ((number == 0||number==0)? 1:number * factorial(number - 1));
    }
    
    
   

}