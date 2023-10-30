package collections;

import java.util.HashSet;

//sum of elements in an array to target element
public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 6, 9, 4};
        int sum = 10;
        printSumofElements(arr, sum);
    }

    static void printSumofElements(int[] a, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            int k = target - a[i];
            if(set.contains(k)) {
                System.out.println("sum " + k + " " + a[i]);
            }
                set.add(a[i]);
        }
    }
}