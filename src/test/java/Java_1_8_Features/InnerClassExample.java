package Java_1_8_Features;

interface Eatable {
    void eat();
}

public class InnerClassExample {
    public static void main(String args[]) {
        //inner class via interface
        Eatable e = new Eatable() {
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        e.eat();
    }
}
