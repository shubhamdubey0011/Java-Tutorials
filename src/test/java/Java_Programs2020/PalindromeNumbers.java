package Java_Programs2020;

public class PalindromeNumbers {
    public static void main(String[] args) {

        /*
         * String number = "12321"; String reverseNumber = ""; for (int i =
         * number.length() - 1; i > 0; i--) { reverseNumber += number.charAt(i); }
         * 
         * if (number.equalsIgnoreCase(reverseNumber)) { System.out.println(number +
         * " is palindrone"); } else System.out.println(number + " is not palindrone");
         */

        int revereseNumber, sum = 0, temp;
        int number = 453;

        temp = number;
        while (number > 0) {
            revereseNumber = number % 10;

            number = number / 10;
            sum = (sum * 10) + revereseNumber;
        }

        if (temp == sum)
            System.out.println(number + " is palindrone");
        else
            System.out.println(number + " is not palindrone");

    }

}
