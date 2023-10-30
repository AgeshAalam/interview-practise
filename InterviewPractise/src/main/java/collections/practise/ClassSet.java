package collections.practise;

import java.util.HashSet;
import java.util.Set;

public class ClassSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(null);
        set.add(2);
        set.add(null);
        set.add(2);
        set.stream().forEach(System.out::println);
    }
}
