package net.valtech.lab;

import java.util.Scanner;

public class ReverseStringWordByWord {

	public static void main(String[] args) {

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		
		
		
		char arr[] = str.toCharArray();
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') 
			{
				i--;
				for (int j = i; j >= k; j--) {
					System.out.print(arr[j]);
				}
				i++;
				k = i;
				System.out.print(arr[i]);
			}
			if (i == arr.length - 1) {
				for (int j = i; j >= k; j--) {
					System.out.print(arr[j]);
				}
			}

		}
	}
}