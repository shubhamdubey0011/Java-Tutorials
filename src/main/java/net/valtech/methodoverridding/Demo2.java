package net.valtech.methodoverridding;



class Father
{
	void smoking()
	{
		System.out.println("normal smoker");
	}
	}

class Son extends Father
{
	void smoking()
	{
		super.smoking();
		System.out.println("chain smoker");
	
}

	
}

public class Demo2 
{
	public static void main(String[] args) 
	{
	   //Father father = new Father();
	   //father.smoking();
	   
	   
	   Son son = new Son();
	   son.smoking();
	   
	   
	}
	
}

