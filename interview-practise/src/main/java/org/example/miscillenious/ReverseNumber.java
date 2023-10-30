package org.example.miscillenious;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=2391;
        int revesed=0;
        while(num>0){
            int k=num%10;
            revesed=revesed*10+k;
            num=num/10;
        }
        System.out.println(revesed);
    }
}
