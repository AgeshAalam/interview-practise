package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class StackExamp {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stack<Integer> balls =new Stack<>();
        balls.addAll(list);
        System.out.println("balls = " + balls);
       Stack<Integer> evenballs= (Stack<Integer>) balls.stream().filter(s->s%2==0).sorted(Comparator.naturalOrder());
        // Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("evenballs = " + evenballs);
    }
}