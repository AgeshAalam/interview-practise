package org.example.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumInArray {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(11,4,34,6,724,9);
        Integer integer = list.stream()
                .sorted(Comparator.reverseOrder())
                .sorted(Comparator.naturalOrder())
               // .skip(1)
                .findFirst().get();
        System.out.println(integer);
    }
}
