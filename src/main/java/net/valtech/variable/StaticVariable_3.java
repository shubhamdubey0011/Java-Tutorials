
/*•	In the case of instance variables for every object a separate copy will be created 
 *  but in the case of static variables for entire class only one copy will be created and shared by every object of that class.
   
  • For every object a separate copy of instance variables will be created.
 */
package net.valtech.variable;

public class StaticVariable_3 {

	int x = 10;
	static int y = 20;

	public static void main(String[] args) {
		StaticVariable_3 st2 = new StaticVariable_3();
		st2.x = 888;
		st2.y = 999;
		System.out.println("from st2 reference " + st2.x + "----" + st2.y);
		StaticVariable_3 st3 = new StaticVariable_3();
		System.out.println("from st3 reference " + st3.x + "----" + st3.y);// 10----999

	}
}
