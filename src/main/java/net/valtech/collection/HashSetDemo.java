package net.valtech.collection;

import java.util.HashSet;


public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		System.out.println( "Collection Test" );
	      // Create a collection
	      HashSet collection = new HashSet();
		// Adding
	      String dog1 = "Max", dog2 = "Bailey", dog3 = "Harriet",dog4=null;
	      collection.add( dog1 );
	      collection.add( dog2 );
	      collection.add( dog3 );
	      
	    int count = collection.size();
	  for (Object object : collection) 
	  {
		System.out.println(object);
	}
	      /*// Sizing
	      System.out.println( "Collection created" + 
	        ", size=" + collection.size() + 
	        ", isEmpty=" + collection.isEmpty() );
	      // Containment
	      System.out.println( "Collection contains " + dog3 + 
	         ": " + collection.contains( dog3 ) );
	      // Iteration. Iterator supports hasNext, next, remove
	      System.out.println( "Collection iteration (unsorted):" );
	      Iterator iterator = collection.iterator();
	      while ( iterator.hasNext() ) 
	         System.out.println( "  all the elements of collections  " + iterator.next() );
	      // Removing
	      collection.remove( dog1 );
	      collection.clear();*/
	   }
	}

	

