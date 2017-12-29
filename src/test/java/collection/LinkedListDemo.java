package collection;

import java.util.LinkedList;

public class LinkedListDemo 
{
public static void main(String[] args) 
{
   LinkedList ll = new LinkedList();	
   ll.add("Shubham");
   ll.add(new StringBuffer("Shubham"));
   ll.add(new StringBuffer("Dubey"));
   ll.set(0, "Mr");
   ll.add(null);
   ll.add(null);
   ll.addFirst("Cho2 aka ::");;
   System.out.println(ll);
}
}
