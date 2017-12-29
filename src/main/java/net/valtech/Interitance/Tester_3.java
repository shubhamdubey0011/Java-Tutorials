package net.valtech.Interitance;


class PersonalDetails
{
 String Fname="shubham";
 String Lname="DUbey";
 void display()
 {
	 
	 System.out.println("First name " +Fname);
	 System.out.println("Last name " +Lname);
 }
}

class OfficalDetails extends PersonalDetails
{
 int salary=9000;
 String Subject="Java";
 
 void display()
 {
	 super.display();
	 System.out.println("INhand Salary " +salary);
	 System.out.println("Subject " +Subject);
 }
}


public class Tester_3 
{
  public static void main(String[] args) 
  {
	  
	  //PersonalDetails pesonald = new  PersonalDetails();
	  //pesonald.display();
	System.out.println("-------------------------------------------------------------");
	 OfficalDetails officed = new  OfficalDetails();
	 officed.display();
}
}
