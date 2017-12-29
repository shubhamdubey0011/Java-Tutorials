package net.valtech.Abstraction;



interface Animal
{
	
	void sound();
	
	}


class Dog implements Animal
{
	
	public void sound()
	{
		System.out.println("bark");
	}
	}

class Cat implements Animal
{
	public void sound()
	{
		System.out.println("meow");
	}
	}

public class Demo extends Cat
{
public static void main(String[] args) 
{
Cat cat=new Cat();
cat.sound();

}
}
