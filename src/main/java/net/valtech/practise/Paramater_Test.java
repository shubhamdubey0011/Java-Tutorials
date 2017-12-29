package net.valtech.practise;

public class Paramater_Test
{

	
	/*public Paramater_Test(String Username,String Password)
	{
		
		
		
	}*/
	
	
	   String login (String Username,String password)
	 {
		System.out.println("pagal");

	return Username+password;
	 
	 }
	
	 
	 public static void main(String [] args)
	 {
	  
	  Paramater_Test P1= new Paramater_Test();
	 
	  
          P1.login("Shubham", "Dubey");
	  
	  
	  
	 }
	 
}
