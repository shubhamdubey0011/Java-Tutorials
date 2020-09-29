package Java_1_8_Features;

import java.util.ArrayList;

public class LambdaExpressionWithLoopingExample {
    public static void main(String[] args) {
        ArrayList<Integer> arralist = new ArrayList<Integer>();
        for (int i = 0; i < 12; i++) {
            arralist.add(i);
        }

        arralist.forEach((n) -> System.out.print(" "+n));
    }
}
