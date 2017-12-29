package net.valtech.methodoverridding;





class person
{
	String Fname="vijay";
	String Lname="Malya";
      void display()
      {
    	  System.out.println("person details ");
    	  System.out.println("firstName" + Fname);
    	  System.out.println("LastName" + Lname);
      }
	}

class Trainer extends person
{
	
	Double salary=900.8;
	String Subject="Java";
	
	void display()
	{
		super.display();
		System.out.println("trainer details");
		System.out.println("Salary" + salary);
		System.out.println("Subject" + Subject);
	}
	
	}
public class Demo1 
{
public static void main(String[] args) 
{

	
	
	//person person = new person();
	//person.display();
	
	
	
	Trainer trainer = new  Trainer();
	
	trainer.display();
	
	
}
}
