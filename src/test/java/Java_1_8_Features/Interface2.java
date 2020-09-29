package Java_1_8_Features;

public interface Interface2 {
void method2();
    
    default void log(String str){
        System.out.println("Interface2 logging::"+str);
    }
}
