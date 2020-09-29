package net.JavaPrograms.java;

public class DisariumNumberDemo {
    public static void main(String[] args) {
 isDisariumNumber(175);
    }

    static void isDisariumNumber(int number) {

        int copyofnumber = number;
        int noofdigit = Integer.toString(number).length();
        int sum = 0;

        while (copyofnumber > 0) {
            int lastdigit = copyofnumber % 10;
            sum = sum + (int) Math.pow(lastdigit, noofdigit);
            noofdigit--;
            copyofnumber = copyofnumber / 10;
            
        }

        if (sum == number)
            System.out.println("Disarium Number.");
        else
            System.out.println("Not a Disarium Number.");

    }

}
