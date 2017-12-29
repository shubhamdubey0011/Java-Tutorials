package collection;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListDemo 
{
public static void main(String[] args) 
{

	String str[]={"A","X","L","P"};
	for (String s1 : str) {
		System.out.println("String array elements ::" +s1);	
	}
	

	
	List<String> list = Arrays.asList(str);
	System.out.println(list);
	list.remove("A");
	System.out.println(list);
}

}
