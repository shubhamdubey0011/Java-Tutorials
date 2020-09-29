package Java_1_8_Features;
@FunctionalInterface
interface Sayable {
    public String say();
}

public class LambdaExpressionWithoutParamsExample {
    public static void main(String[] args) {

        Sayable s = () -> {
            return "hello from lambda expression without params";
        };
        System.out.println(s.say());
    }
}
