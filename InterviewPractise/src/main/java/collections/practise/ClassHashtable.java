package collections.practise;

import java.util.Hashtable;

public class ClassHashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable<>();

        hashtable.put(3,null);
        hashtable.put(1,"one");
        hashtable.put(1,"one");
        hashtable.put(2,"two");
        System.out.println("hashtable = " + hashtable);
    }
}
