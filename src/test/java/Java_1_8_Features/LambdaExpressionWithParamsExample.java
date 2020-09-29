package Java_1_8_Features;

interface speakable 
{
    public String speakable(String Str); 
    
}
public class LambdaExpressionWithParamsExample {
public static void main(String[] args) {
    speakable sp=(str)->{
        return str;};
       System.out.println(sp.speakable("Hello from Lambda Expression With Params Example"));
}
}
