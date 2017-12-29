package collection;

import java.util.Stack;

public class StackDemo 
{

	public static void main(String[] args) 
	{
	
		Stack stack = new Stack();
		for (int i = 1; i <=10; i++) 
		{
		     stack.push(i);	
		}
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.peek();
		System.out.println(stack);
	}
}
