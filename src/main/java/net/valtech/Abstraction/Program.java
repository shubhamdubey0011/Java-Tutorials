package net.valtech.Abstraction;

/// <summary>
/// We have an Employee class having two properties EmployeeName and EmployeeCode
/// </summary>
class Employee
{
  public String EmplpyeeName; 
  public String EmployeeCode; 

  // Add new employee to DB is the main functionality, so are making it public so that we can expose it to external environment
  // This is ABSTRACTION
  public void AddEmployee(Employee obj)
  {
      // "Creation of DB connection" and "To check if employee exists" are internal details which we have hide from external environment
      // You can see that these methods are private, external environment just need "What" part only
      CreateDBConnection();
      CheckIfEmployeeExists();
  }


  // ENCAPLUSATION using private keyword
  private boolean CheckIfEmployeeExists()
  {
      // Here we can validate if the employee already exists
      return true;
  }

  // ENCAPLUSATION using private keyword
  private void CreateDBConnection()
  {
      // Create DB connection code
	  System.out.println("connection created");
  }
}



class Program
{
   public static void main(String[] args)
    {
        Employee obj = new Employee();
        obj.EmplpyeeName = "001";
        obj.EmployeeCode = "Raj";

        // We have exposed only what part of the functionality
        obj.AddEmployee(obj);
    }
}
