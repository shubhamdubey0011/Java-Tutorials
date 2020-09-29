package Java_Programs2020;

import java.util.Random;

class Exco extends Exception {
    
}
class Exc1 extends Exco{
    
}


public class Test {
public static void main(String[] args) {
        /*
         * try { throw new Exc1(); }catch (Exco e1) { // TODO: handle exception
         * System.out.println("Exco caught"); } catch (Exception e) { // TODO: handle
         * exception System.out.println("Exception caught"); }
         */
    
        /*
         * // Creating an empty HashMap HashMap<Integer, String> hash_map = new
         * HashMap<Integer, String>();
         * 
         * // Mapping string values to int keys hash_map.put(10, "Geeks");
         * hash_map.put(15, "4"); hash_map.put(20, "Geeks"); hash_map.put(25,
         * "Welcomes"); hash_map.put(30, "You"); hash_map.put(35, "You");
         * 
         * // Displaying the HashMap System.out.println("Initial Mappings are: " +
         * hash_map);
         * 
         * // Using entrySet() to get the set view System.out.println("The set is: " +
         * hash_map.entrySet());
         */
   System.out.println(randomNumericBetweenRange(1, 5));
    
}

public static int randomNumericBetweenRange(int start, int end) {
    Random r = new Random();
    return r.nextInt(end - start) + start;
}

}
