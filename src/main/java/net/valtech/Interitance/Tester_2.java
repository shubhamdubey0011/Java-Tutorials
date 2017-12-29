package net.valtech.Interitance;


class A
{
	
void test1()
{
System.out.println("from test1() of class A");	
}


}

class B extends A
{
	
void test1(int a)
{
System.out.println("from test1(int a) of class B");	
}
}

public class Tester_2
{
 public static void main(String[] args) 
 {
      B b=new B();	
      
     b.test1(0);
      b.test1();
}
	
}
