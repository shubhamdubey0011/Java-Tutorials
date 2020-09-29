package Java_1_8_Features;

public interface Interface1 {
    void method1(String str);

    default void log(String str) {
        System.out.println("Interface1 logging ::" + str);

    }

    static void print(String str) {
        System.out.println("Interface1 printing output ::" + str);

    }
    
    
      default String toString(){ return "i1"; }
     
    
    
}
