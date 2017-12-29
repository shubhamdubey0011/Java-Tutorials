package net.valtech.Strings;

public class StringBufferMethods 
{

	public static void main(String[] args) 
	{
	
		//•Creates an equivalent StringBuffer object for the given String with capacity=s.length()+16;
//		String s="Shubham";
//		StringBuffer sb=new StringBuffer(s);
//		System.out.println(sb.capacity());//23
		
//		1)	public int length();
//		•	Return the no of characters present in the StringBuffer.
//		2)	public int capacity();
//		•	Returns the total no of characters but a StringBuffer can accommodate(hold).
//		3)	public char charAt(int index);
//		•	It returns the character located at specified index.

//		StringBuffer sb=new StringBuffer("vijayabhaskarreddy");
//		System.out.println(sb.length());//18
//		System.out.println(sb.capacity());//34
//		System.out.println(sb.charAt(14));//e


		
		//4)	public void setCharAt(int index,char ch);
		
//		StringBuffer sb=new StringBuffer("vijayabhaskarreddy");
//		sb.setCharAt(6,'A');
//		System.out.println(sb);
		
	
//		5)	public StringBuffer append(String s);
		
//		StringBuffer sb=new StringBuffer();
//		sb.append("PI value is :");
//		sb.append(3.14);
//		sb.append(" this is exactly ");
//		sb.append(true);
//		System.out.println(sb);//PI value is :3.14 this is exactly true	

		
		//6)	public StringBuffer insert(int index,String s);
//		StringBuffer sb=new StringBuffer("vijaya");
//		sb.insert(5,"bhaskar");
//		sb.insert(13,"02");
//		System.out.println(sb);//vijayabhaskar9	

		
		//7)	public StringBuffer delete(int begin,int end);
		//8)	public StringBuffer deleteCharAt(int index);
//		StringBuffer sb=new StringBuffer("vijayabhaskar");
//		System.out.println(sb);//vijayabhaskar
//		sb.delete(6,13);
//		System.out.println(sb);//vijaya
//		sb.deleteCharAt(5);
//		System.out.println(sb);//vijay
		
		
		//9)	public StringBuffer reverse();
//		StringBuffer sb=new StringBuffer("vijayabhaskar");
//		System.out.println(sb);//vijayabhaskar
//		System.out.println(sb.reverse(	));//raksahbayajiv
	
		
		//10)	public void setLength(int length);
		//•	Consider only specified no of characters and remove all the remaining characters.
//		StringBuffer sb=new StringBuffer("vijayabhaskar");
//		sb.setLength(6);
//		System.out.println(sb);//vijaya
		
//		11)	public void trimToSize();
//		•	To deallocate the extra free memory such that capacity and size are equal.
		
		
//		StringBuffer sb=new StringBuffer(1000);
//		System.out.println(sb.capacity());//1000
//		sb.append("bhaskar");
//		System.out.println(sb.capacity());//1000
//		sb.trimToSize();
//		System.out.println(sb.capacity());//7
		
		
		
//		12)	public void ensureCapacity(int initialcapacity);
//		•	To increase the capacity dynamically based on our requirement.
		
		
//		StringBuffer sb=new StringBuffer();
//		System.out.println(sb.capacity());//16
//		sb.ensureCapacity(1000);
//		System.out.println(sb.capacity());//1000
		
		
		//•	In method chaining all methods will be evaluated from left to right.
		StringBuffer sb=new StringBuffer();
		sb.append("vijaya").insert(6,"bhaskarreddy").delete(13,17).reverse().append("solutions").insert(22,"abcdf").reverse();
		System.out.println(sb);//sfdcbanoitulosvijayabhaskary

		
		
		
		





		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
