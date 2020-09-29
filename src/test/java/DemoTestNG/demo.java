package DemoTestNG;

public class demo {
public static void main(String[] args) {
    int x=100;
    int y;
    if (x<100) {
        y=x/0;
    }
    if (x>=100) {
        y=x*0;
    }
    System.out.println("value of y is "+y);
    
}
}
