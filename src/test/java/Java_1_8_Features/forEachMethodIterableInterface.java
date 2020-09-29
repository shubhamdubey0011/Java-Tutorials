package Java_1_8_Features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class forEachMethodIterableInterface {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            arraylist.add(i);
        
        
//with iterator 
        Iterator<Integer> itr = arraylist.iterator();
        while (itr.hasNext()) {
            Integer integer = (Integer) itr.next();
            System.out.println("Using iterator Iterator's Value " + integer);

        }
//Using foreach() method
        arraylist.forEach(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("for each method anonymous class value ::" + t);
            }
        });
        MyConsumer action = new MyConsumer();
        arraylist.forEach(action);

    }
}

class MyConsumer implements Consumer<Integer> {

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::" + t);
    }

}
