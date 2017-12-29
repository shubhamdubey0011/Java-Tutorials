package net.valtec.constructor;

//Constructor overloading 
class person
{
  private String name;
  private int age;

  person()//default constrcutor is used to initiliaze all the objects with same data 
  {
	  name ="Raju";
	  age=22;
	  
  }
  person(String s,int i)//parameterozed constrcutor is used to initiliaze all the objects with same data 
  {
	  name=s;
	  age=i;
  }
  
  void talk()
  {
	  System.out.println("my name is "+name);
	  System.out.println("my age is "+age);
	  
  }
}


public class Constructor_overloading 
{
public static void main(String[] args) 
{
	person raju = new person();
	raju.talk();
	
	person seeta = new person("sita",14);
	seeta.talk();
}
}
