package net.valtech.collection.map;

import java.util.Hashtable;

class HashtableDemo {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(new Temp1(5), "A");
		h.put(new Temp1(2), "B");
		h.put(new Temp1(6), "C");
		h.put(new Temp1(15), "D");
		h.put(new Temp1(23), "E");
		h.put(new Temp1(16), "F");
		System.out.println(h);// {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
		
	}
}

class Temp1 
{
	int i;

	Temp1(int i)
	{
		this.i = i;
	}

	public int hashCode() {
		System.out.println(i);
		return i;
		
	}

	public String toString() {
		return i + "=>";
	}
}
