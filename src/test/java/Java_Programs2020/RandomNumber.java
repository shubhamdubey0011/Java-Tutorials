package Java_Programs2020;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    public static void main(String[] args) {
        // Using Math class random method
        System.out.println(Math.random());

        
        // Using formula {math.random()*(max-min+1)+min}
        int min = 200;
        int max = 400;

        System.out.println("Random value of type double between " + min + " to " + max + ":");
        double a = Math.random() * (max - min + 1) + min;
        System.out.println(a);
        System.out.println("Random value of type int between " + min + " to " + max + ":");
        int b = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(b);
        
     // Using Java.util.Random class
        Random randomizer = new Random();
        System.out.println(randomizer.nextInt(50));
        System.out.println(randomizer.nextInt(1000));
        
        // Using ThreadlocalRandomclass
        
       System.out.println(ThreadLocalRandom.current().nextInt(1,100));
       System.out.println(ThreadLocalRandom.current().nextInt(1,10));
        

    }
}
