package net.valtech.practise;

public class Operators {

	public static void main(String[] args) 
	{
		int x=10, y=15;
		if( ++x > 10 || ++y < 15 )
		{ 
			++x;
		}
		else
		{
			++y;
		}
		System.out.println(x+"------------"+y);//11---
	}
}
