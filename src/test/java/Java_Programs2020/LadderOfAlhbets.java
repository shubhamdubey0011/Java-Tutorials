package Java_Programs2020;

public class LadderOfAlhbets {
public static void main(String[] args) {
    int alphabet=65,rows=12;
    
    for(int i=1;i<rows;i++)
    {            
        for(int j=1;j<=i;j++)
        {
            System.out.print((char)alphabet);
            alphabet++;
        }
        System.out.println();
    }
}
}
