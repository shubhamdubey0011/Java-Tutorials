package net.valtech.collection.map;

public interface MapDemo1 
{

	interface Entry
	{
		Object getKey();
		Object getValue();// on Entry we can apply these 3 methods. 
		Object setValue(Object new);
	}

}
