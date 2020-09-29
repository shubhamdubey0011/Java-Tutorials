package Java_1_8_Features;

@FunctionalInterface
interface Drawable {
    public void draw();
}

public class WithoutLambdaExpressionExample {
    public static void main(String[] args) {
        int width = 10;

        Drawable d = new Drawable() {

            @Override
            public void draw() {
                System.out.println("Drawing with width::" + width);
            }
        };
        d.draw();
    }

}
