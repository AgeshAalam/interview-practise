package org.example.miscillenious;

import java.util.Arrays;

public class SumOfGivenNumber {
    public static void main(String[] args) {
        int num=12309;
        int sum=0;
        while (num>0){
            int k=num%10;
             sum+=k;
             num=num/10;
        }
        System.out.println(sum);
    }
}
