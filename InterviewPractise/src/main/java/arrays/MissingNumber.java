package arrays;

import java.util.Arrays;

import static java.util.Arrays.*;

public class SortingArrays {
    
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 5, 3,8,6};

        int n=array.length+1;
        int sum=0;
        int actualsum=(n*(n+1))/2;
        System.out.println("actualsum = " + actualsum);
        for (int num:array) {
           // sum=sum+num;
            actualsum-=num;
        }
        System.out.println(actualsum);
        int missingnumber=actualsum-sum;
        System.out.println("missingnumber = " + missingnumber);

    }
}