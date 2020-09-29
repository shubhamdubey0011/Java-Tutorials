package Java_Programs2020;

public class recursiereversestring {
public static void main(String[] args) {
    String str=" cornflakes ";
  System.out.println(doreverse(str));
}
static String doreverse(String str)
{
    
    if ((str==null) ||(str.length()<=1)) {
        return str; 
    }
    return doreverse(str.substring(1))+str.charAt(0);
}
}
