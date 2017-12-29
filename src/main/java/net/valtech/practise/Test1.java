package net.valtech.practise;

public class Test1 
{
	 public static void main(String []args) 
	 {
	  m1(1);
	 }
	 static void m1(int i)
	 {	  
	  System.out.println(i);//1 2 3 
	  if(i==3) 
	  {
	   //return;
	  }
	  m1(i+1);
	  System.out.println(i);
	  
	 
	 }
	}
