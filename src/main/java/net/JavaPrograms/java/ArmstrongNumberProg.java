package net.JavaPrograms.java;

public class ArmstrongNumberProg {
    public static void main(String[] args) {
isArmstrogNumber(153);
    }

    static void isArmstrogNumber(int number) {
        int copyOfNumber = number;
        int sum = 0;
        int noofdigits = String.valueOf(number).length();
        while (copyOfNumber != 0) {
            int lastdigit = copyOfNumber % 10;
            int lastdigitToThePowerOfNumberOfDigits = 1;
            for (int i = 0; i < noofdigits; i++) {
                lastdigitToThePowerOfNumberOfDigits = lastdigitToThePowerOfNumberOfDigits * lastdigit;
            }
            sum=sum + lastdigitToThePowerOfNumberOfDigits;
            copyOfNumber = copyOfNumber / 10;
        }

        if (sum == number) {
            System.out.println(number + " is an armstrong number");
        } else {
            System.out.println(number + " is not an armstrong number");
        }

    }
}
