package collections;

import java.util.Arrays;

public class CountStringsInString {
   public static void main(String[] args) {
       int count=0;
      String s = "hello welcome to hello from welcome bye";
      String[] words = s.split(" ");
      //System.out.println(Arrays.stream(words).count());
      // long count = Arrays.stream(words).count();
for(String s1:words){
    count++;

}System.out.println(count);

   }
}
