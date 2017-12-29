package net.valtech.Interitance;


class H
{
   void test1()
   {
	   System.out.println("from test1 of class H");
   }
}

class I extends H
{
   void test2()
   {
	   System.out.println("from test2 of class I");
   }
}
class J extends H
{
   void test3()
   {
	   System.out.println("from test3 of class J");
   }
}
public class HybridInheritance 
{
public static void main(String[] args) 
{
	J rv = new J();
	rv.test1();
	rv.test3();
	
	I rv1 = new I();
	rv1.test1();
	rv1.test2();
}
}
