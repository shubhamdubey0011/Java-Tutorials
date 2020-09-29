package Java_1_8_Features;

@FunctionalInterface
interface addable
{
   int add(int x,int y);    
}
public class LambdaExpressionWithMultipleParamsExample {
public static void main(String[] args) {

    addable ad=(x,y)->(x+y);
    System.out.println("Sum of x and y is :::"+ad.add(9, 91));
}
}
