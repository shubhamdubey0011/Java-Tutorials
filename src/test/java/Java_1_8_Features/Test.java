package Java_1_8_Features;

public class Test {
    // creating a private field
    private String s;

    // creating a public constructor
    public Test() {
        s = "GeeksforGeeks";
    }

    // Creating a public method with no arguments
    public void method1() {
        System.out.println("The string is " + s);
    }

    // Creating a public method with int as argument
    public void method2(int n) {
        System.out.println("The number is " + n);
    }

    // creating a private method
    private void method3() {
        System.out.println("Private method invoked");
    }
}
