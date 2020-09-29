package Java_Programs2020;

public class FibonacciWithoutrecursion {
public static void main(String[] args) {
    
    int a=0,b=1,c,i,count=10;
    System.out.print(a+" "+b);
    for (i = 0; i < count; i++) {
        c=a+b;
        System.out.print(" "+c);
        a=b;
        b=c;
        
    }
}
}
