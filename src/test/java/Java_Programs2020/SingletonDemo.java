package Java_Programs2020;

class Mysingleton {
    static Mysingleton instance = null;
    static int x = 10;

    private Mysingleton() {
    }

    public static Mysingleton getinstance() {
        if (instance == null)
            instance = new Mysingleton();
        return instance;

    }

}

public class SingletonDemo {
    public static void main(String[] args) {
        Mysingleton a = Mysingleton.getinstance();
        Mysingleton b = Mysingleton.getinstance();
        a.x = a.x + 10;
        System.out.println("Value of a.x = " + a.x);
        System.out.println("Value of b.x = " + b.x);
    }
}
