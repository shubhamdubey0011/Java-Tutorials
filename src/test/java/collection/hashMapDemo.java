package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put(null, 100);
        map.put("Shivam", 110);
        map.put("Shivam", 130);
        map.put(null, 120);
Set<Entry<String, Integer>> entry = map.entrySet();      
Iterator<Entry<String, Integer>> itr = entry.iterator();
while (itr.hasNext()) {
    Map.Entry<java.lang.String, java.lang.Integer> entry2 = (Map.Entry<java.lang.String, java.lang.Integer>) itr.next();
    System.out.println(entry2);
}
        
        
    }

}
