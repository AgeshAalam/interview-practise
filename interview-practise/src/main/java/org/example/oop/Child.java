package org.example.oop;

public class Child extends Parent{
    @Override
    public void m1() throws Exception{
        System.out.println("from child m1");
    }
    public static void m2() {
        System.out.println("from child m2");
    }

    public static void main(String[] args) throws Exception {
        Parent p=new Child();
        //p.m1();
        p.m2();
    }
}
