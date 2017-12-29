package net.valtech.lab;

import java.util.Scanner;

public class PrimeNumber 
{

public static void main(String[] args) 
{


	int num;
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
    num=sc.nextInt();
    for (int i = 2; i < num; i++) {
    	if(num%i==0){
	count++;
	break;
	}
    }
    if(count==0){
    	System.out.println("Number is Prime");
    }else{
    	System.out.println("Number is not Prime");
    }
}
	
}
