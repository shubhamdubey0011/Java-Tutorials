package net.valtech.OOPS;



class Animal{}
class Monkey extends Animal{}


class Test 
{

	public void methodOne(Animal a)
	{
		System.out.println("Animal version");
	}
	public void methodOne(Monkey m)
	{
		System.out.println("Monkey version");
	}
	public static void main(String[] args)
	{
		Test t=new Test();
		Animal a=new Animal();
		t.methodOne(a);//Animal version
		Monkey m=new Monkey();
		t.methodOne(m);//Monkey version
		Animal a1=new Monkey();
		t.methodOne(a1);//Animal version
	}

}
