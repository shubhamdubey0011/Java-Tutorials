package net.valtech.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListTest 
{
	
	//can store null.indexed type ,can store dulicate 
	   // Statics
	   public static void main( String [] args ) {
	      System.out.println( "List Test" );
	      // Create a collection
	      ArrayList<String> list = new ArrayList<String>();
	      // Adding
	      String [] toys = { "Shoe", "Ball","Frisbee", "Frisbee",null };
	      list.addAll( Arrays.asList( toys ) );
	      System.out.println("listiterator in forward direction");
	      ListIterator<String> listiterator = list.listIterator();
	     while(listiterator.hasNext())
	    	
	    	 System.out.println(" " + listiterator.next());
	    
	      // Sizing
	      System.out.println( "List created" + 
	        ", size=" + list.size() + 
	        ", isEmpty=" + list.isEmpty() );
	      
	      list.set(1, "Bat");
	      
	    	 // Iteration using indexes.
	      System.out.println( "List iteration (unsorted):" );
	      for ( int i = 0; i < list.size(); i++ ) 
	         System.out.println( "   " + list.get( i ) );
	      
	      
	     
	     
	     
	  
	     
	      
	      
	     
	   }
	}