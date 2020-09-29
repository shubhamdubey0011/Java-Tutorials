package Java_1_8_Features;

public class MyClass implements Interface1,Interface2{
    

    @Override
    public void method2() {
        // TODO Auto-generated method stub
        System.out.println("implementation of interace1 method1");
        
    }

    @Override
    public void method1(String str) {
        // TODO Auto-generated method stub
        System.out.println("implementation of interace2 method2");
        System.out.println("string is "+str);
        
    }
    @Override
    public void log(String str){
        System.out.println("MyClass logging::"+str);
        Interface1.print("abc");
    }
    public static void main(String[] args) {
         MyClass clss = new MyClass();
         clss.method1("Hello");
         clss.method2();
    }
    

}

