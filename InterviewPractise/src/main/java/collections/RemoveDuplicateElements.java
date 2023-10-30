package collections;

import java.util.Arrays;

public class RemoveDuplicateElements {
   public static void main(String[] args) {
      String string = "Hello hi welcome to hello from hi by hello hi";
      String[] s = string.split(" ");
      Arrays.stream(s).distinct().forEach(System.out::println);

   }
}


