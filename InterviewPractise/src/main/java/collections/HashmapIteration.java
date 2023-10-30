package collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapIteration {
   public static void main(String[] args) {
      HashMap<Integer, String> map = new HashMap<>();
      map.put(1, "a");
      map.put(2, "b");
      map.put(3, "c");
      map.put(4, "d");

     /* for (Map.Entry<Integer,String> e:map.entrySet()){
         System.out.println(e.getKey() + " "+ e.getValue());
      }*/

     // map.entrySet().stream().forEach(System.out::println);
    //  map.keySet().stream().forEach(System.out::println);
     // map.values().stream().forEach(System.out::println);
      map.keySet().stream().forEach(System.out::println);

   }
}
