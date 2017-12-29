package net.valtech.collection;

import java.util.Hashtable;

public class HashtableDemo 
{
public static void main(String[] args) 
{

	Hashtable h=new Hashtable();
	h.put(5,'A');
	h.put(new Temp(2),"B");
	h.put(new Temp(6),"C");
	h.put(new Temp(15),"D");
	h.put(new Temp(23),"E");
	h.put(new Temp(16),"F");
	h.put(17,"F");
	h.put(17,"F");
	System.out.println(h);//{6=C, 16=F, 5=A, 15=D, 2=B, 23=E}

}
}

class Temp
{
	int i;
	Temp(int i)
	{
		this.i=i;
	}
	public int hashCode()
	{
		//return i%9;//{16=F, 17=F, 15=D, 6=C, 23=E, 5=A, 2=B}
		return i;//{17=F, 6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
	}
	public String toString()
	{
		return i+"";
	}

	}