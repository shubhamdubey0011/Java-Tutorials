package net.valtech.practise;

public class IncrementDecrement 
{
	public static void main(String[] args) 
	{
		
		int x=4;
//		int y=++x;//preIncrement        x=x+1;   return x;
		
//		int y=x++;//postIncrement     temp=x;    x=x+1;    return temp;
		
		//int y=--x;//preDecrement      x=x-1;     return x;
		
        int y=x--;//postDecrement   temp=x ;   x=x-1;   return temp;
		
		System.out.println(y);
		System.out.println(x);
	}
}

//#####PreIncrement
//++a
//
//a = a + 1;
//return a;

//a++
//
//temp = a;
//a = a + 1;
//return temp;


//###PostIncrement
// --a
//
// a = a - 1;
// return a;

// a--
//
// temp = a;
// a = a - 1;
// return temp;