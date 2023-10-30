package org.example;

import java.util.ArrayList;
import java.util.List;

public class App 
{
 void m1(){
    List<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(null);
    list.add(1);
    list.remove(1);
    Object obj= getData();
    System.err.println(obj.toString());
}
public  Object getData(){
    return null;
}
    public static void main( String[] args )
    {
        App app=new App();
        app.m1();
    }
}
