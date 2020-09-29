package Java_Programs2020;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 3;
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;

        }
        if (n % 2 != 0) {
            return false;
        }

        return true;
    }

}
