package net.valtech.Interitance;

class Superclass
{
    void Demo()
    {
    	
    	System.out.println("from Demo() of class superClass");
    	
    }
}
class L extends Superclass
{
    void Demo()
    {
    	
    	System.out.println("from Demo1() of class L");
    	
    }
}

class M extends Superclass 
{
    void Demo()
    {
    	
    	System.out.println("from Demo1() of class M");
    	
    }
}

public class Multiple_Inheritance 
{
 public static void main(String[] args) 
 
 {
     	M rv = new M();
     	rv.Demo();
     	//rv.Demo2();
     	
     	
     	L rv2 = new L();
     	rv2.Demo();
     	//rv2.Demo1();
     	
 
     	
     	
}
}
