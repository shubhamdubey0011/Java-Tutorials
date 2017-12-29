package net.valtech.collection;

public class ComparableTest 
{

public static void main(String[] args) {
	
	System.out.println("A".compareTo("Z"));//-25
	System.out.println("Z".compareTo("K"));//15
	System.out.println("A".compareTo("A"));//0
	//System.out.println("A".compareTo(new Integer(10)));//Test.java:8: compareTo(java.lang.String) in java.lang.String cannot be applied to (java.lang.Integer)
	//System.out.println("A".compareTo(null));//NullPointerException
}

}
