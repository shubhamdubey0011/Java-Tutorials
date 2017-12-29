package net.valtech.logicalCodes;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		/*	
//1.write a program of fibonacci Series
		
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		int a,b=0,c=1;
		for(int i=0;i<=num;i++) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}

//2.write a program of prime number

		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();

		for(int i=2;i<=num;i++) {
		if(num%i==0) {
			System.out.println("Number is not Prime");
		}else {
			System.out.println("Number is Prime");
		}		
		break;
		}

		//3.write a program of factorial

		int num,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);


//4.write a program to reverse the String

		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		char arr[]=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}


//5.write a program to short the string without using built in method
		String str="agdcbef";
		char temp=0;
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=arr.length-1;k>=0;k--) {
			System.out.print(arr[k]);
		}
//6.write a program to given number is palindrom or not

	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	num=sc.nextInt();
	int a=num;
	int reverse=0;
	int remainder;
	while(num>0) {
		remainder=num%10;
		reverse=reverse*10+remainder;
		num=num/10;
		}
	if(reverse==a) {
		System.out.println(a+" is palindrom");
	}else {
		System.out.println(a+" is not palindrom");
	}


//7.write a program of given String is palindrom

		String str,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String value");
		str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("String is palindrom");
		}
		else {
			System.out.println("String is not palindrom");
		}

//8.write a program to find small and bigger number in Array

		int arr[]= {2,5,7,4,9,12,1,0,19};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
			System.out.println("Largest Number in the array is "+max);
			System.out.println("Smallest Number in the array is "+min);



//9.write a program to remove vowel in the given string

		String str,newStr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		newStr=str.replaceAll("[aeiouAEIOU]", "");
		System.out.println("After Removing of vowel:"+newStr);



//10.write a program to revesre the number

		int num;
		int remainder;
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();

		while(num>0) {
			remainder=num%10;
			result=result*10+remainder;
			num=num/10;
		}
		System.out.println("Reverse: "+result);
		 
//11.write a program of given Pattern		
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(""+i);
			}
			System.out.println();
		}
		
		o/p
		1
		22
		333
		4444
		
//12.write a program of given Pattern
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(""+j);
			}
			System.out.println();
		}
		o/p
		1
		12
		123
		1234
	
//13.write a program of given Pattern
		
		char i,j;
		for( i='A';i<='E';i++) {
			for(j='A';j<=i;j++) {
				System.out.print(""+i);
			}
			System.out.println();
		}
		
		o/p
		A
		BB
		CCC
		DDDD
		EEEEE

//14.write a program of given Pattern
		
				char i,j;
				for( i='A';i<='E';i++) {
					for(j='A';j<=i;j++) {
						System.out.print(""+j);
					}
					System.out.println();
				}		
		o/p
		A
		AB
		ABC
		ABCD
		ABCDE

//15.write a program of given Pattern
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
			System.out.print(""+i);		
			}
			System.out.println();
		}
		o/p
		55555
		4444
		333
		22
		1
	
//16.write a program of given Pattern		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
			System.out.print(""+j);		
			}
			System.out.println();
		}
		o/p
		12345
		1234
		123
		12
		1
			
	//17.write a program of given Pattern	
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
			System.out.print(""+j);		
			}
			System.out.println();
		}
o/p
54321
5432
543
54
5

	
//18.write a program of given Pattern	
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
			System.out.print(""+i);		
			}
			System.out.println();
		}
o/p
11111
2222
333
44
5

//19.write a program of given Pattern	
		for(int i=0;i<6;i++) {
			for(int j=0;j<6-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
o/p
               *
              ***
             *****
            *******
           *********
          ***********
	
//20.write a program of given Pattern
		
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				if((i+j)%2==0) {
				System.out.print("1");	
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
o/p
1
01
101
0101
10101
	
//21.write a program to print how many times a charater is repeated
		
		String str="pankaj";
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		char ch[]=str.toCharArray();
		for(char c:ch) {
			if(m.get(c)==null) {
				m.put(c, 1);
			}else {
				m.put(c, m.get(c)+1);
			}
		}
		System.out.println(m);
		Set s=m.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
			
//21.write a program to print how many times a charater is repeated	
		
		String str="Hii I am Pankaj kumar pushpam i from Samastipur Bihar";
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		char ch[]=str.toCharArray();
		for(char c:ch) {
			if(m.get(c)==null) {
				m.put(c, 1);
			}else {
				m.put(c, m.get(c)+1);
			}
		}
		System.out.println(m);
		Set s=m.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		
		//write a program to remove duplicate element from the Array
		   int[][] test = new int[][]{{1, 1, 2, 2, 3, 4, 5},{1, 1, 1, 1, 1, 1, 1},{1, 2, 3, 4, 5, 6, 7},{1, 2, 1, 1, 1, 1, 1},};

	        for (int[] input : test) {
	            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
	            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
	        }
	    }
	    public static int[] removeDuplicates(int[] numbersWithDuplicates) {

	        // Sorting array to bring duplicates together      
	        Arrays.sort(numbersWithDuplicates);     
	      
	        int[] result = new int[numbersWithDuplicates.length];
	        int previous = numbersWithDuplicates[0];
	        result[0] = previous;

	        for (int i = 1; i < numbersWithDuplicates.length; i++) {
	            int ch = numbersWithDuplicates[i];

	            if (previous != ch) {
	                result[i] = ch;
	            }
	            previous = ch;
	        }
	        return result;
*/	

	}
}
