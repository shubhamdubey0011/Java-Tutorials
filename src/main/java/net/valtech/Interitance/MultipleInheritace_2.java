package net.valtech.Interitance;



 abstract class SuperClass1 
{

	public abstract void doSomething();
}
 
  class ClassA extends SuperClass1{
		
		@Override
		public void doSomething(){
			System.out.println("doSomething implementation of A");
		}
		
		//ClassA own method
		public void methodA(){
			
		}
	}
  
  class ClassB extends SuperClass1{

		@Override
		public void doSomething(){
			System.out.println("doSomething implementation of B");
		}
		
		//ClassB specific method
		public void methodB(){
			
		}
	}
  
  class ClassC extends ClassA, ClassB
  {

		public void test(){
			//calling super class method
			doSomething();
		}

	}
  
  
 
public class MultipleInheritace_2 
{

}
