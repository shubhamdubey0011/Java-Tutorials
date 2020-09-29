package Java_1_8_Features;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
    Test testref = new Test();
    
  Class  clss=testref.getClass();
  System.out.println("The name of the class is "+clss.getName());
  
  Constructor constructor;
try {
    constructor = clss.getConstructor();
    System.out.println("The name of constructor is " + 
            constructor.getName()); 
} catch (NoSuchMethodException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
} catch (SecurityException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    
    
    
} 

Method[] methods = clss.getMethods(); 
for (Method method:methods) 
    System.out.println(method.getName()); 


Method methodcall1 = clss.getDeclaredMethod("method2", int.class); 
methodcall1.invoke(testref, 19);

Field fields = clss.getDeclaredField("s");

fields.setAccessible(true); 

fields.set(testref, "Newly added value at run time using reflection");

Method methodcall2 = clss.getDeclaredMethod("method1"); 
methodcall2.invoke(testref );



  Method methodcall3 = clss.getDeclaredMethod("method3");
  methodcall3.setAccessible(true);
  
  methodcall3.invoke(testref);




  
    
    
}
}
