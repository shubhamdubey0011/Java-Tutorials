package net.valtech.WrapperClasses;

public class Wrapper_2 {
	public static void main(String[] args) 
	{
	
		
//		valueOf() method: We can use valueOf() method to create wrapper object for the given
//primitive or String this method is alternative to constructor.
		
		
//		Integer i=Integer.valueOf("10");
//		Double d=Double.valueOf("10.5");
//		Boolean b=Boolean.valueOf("bhaskar");
//		System.out.println(i);//10
//		System.out.println(d);//10.5
//		System.out.println(b);//false
		
		
		
//		xxxValue() method :: We can use xxxValue() methods to convert wrapper object to primitive.
//		Integer i=new Integer(130);
//		System.out.println(i.byteValue());//-126
//		System.out.println(i.shortValue());//130
//		System.out.println(i.intValue());//130
//		System.out.println(i.longValue());//130
//		System.out.println(i.floatValue());//130.0
//		System.out.println(i.doubleValue());//130.0
//
//		Character ch=new Character('a');
//		char c=ch.charValue();
//		System.out.println(c);//a
//
//		Boolean b=new Boolean("bhaskar");
//		boolean b1=b.booleanValue();
//		System.out.println(b1);//false
		
		
//		parseXxx() method: We can use this method to convert String  to corresponding primitive.
//		public static primitive parseXxx(String s);
		
//		int i=Integer.parseInt("10");
//		boolean b=Boolean.parseBoolean("bhaskar");
//		double d=Double.parseDouble("10.5");
//		System.out.println(i);//10
//		System.out.println(b);//false
//		System.out.println(d);//10.5
//
//


//		public static String toString(primitive p);
		String s1=Integer.toString(10);
		String s2=Boolean.toString(true);
		System.out.println(s1);//10
		System.out.println(s2);//true
		
		Integer i=Integer.valueOf("10");
		System.out.println(i);//10
		System.out.println(i.toString());//10

		
		

	}

}
