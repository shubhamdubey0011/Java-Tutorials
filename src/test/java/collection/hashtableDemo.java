package collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class hashtableDemo {
public static void main(String[] args) {
  Map<String, Integer> htable = new Hashtable<String, Integer>();  
  //htable.put(null, 10);
  htable.put("Shubham", 20);
  htable.put("Shubham",180);
  Set<Entry<String, Integer>> entry = htable.entrySet();      
  Iterator<Entry<String, Integer>> itr = entry.iterator();
  while (itr.hasNext()) {
      Map.Entry<java.lang.String, java.lang.Integer> entry2 = (Map.Entry<java.lang.String, java.lang.Integer>) itr.next();
      System.out.println(entry2);
  }
  
}
}
