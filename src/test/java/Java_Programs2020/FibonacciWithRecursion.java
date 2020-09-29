package Java_Programs2020;

public class FibonacciWithRecursion {
    static int a = 0, b = 1, c = 0;

    public static void main(String[] args) {

        int count = 10;
        System.out.print(a + " " + b);
        printRecursion(count - 2);
    }

    private static void printRecursion(int count) {

        if (count > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
            printRecursion(count-1);

        }
    }
}
