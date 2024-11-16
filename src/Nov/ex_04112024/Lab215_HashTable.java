package Nov.ex_04112024;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab215_HashTable {
    public static void main(String[] args) {
        // Map
        // 1 null allows

        // Hashtable >> doesn't allow null key and null value
        // Synchronised
        // Slow
        // Legacy Class >> old class >> its part of collection framework

        Hashtable<String, Integer> ht1 = new Hashtable<>();
        ht1. put("one", 1);
        ht1. put("two", 2);
        ht1. put("three", 3);
//        ht1.put("four", null);
         ht1.put(null, 4);
        System.out.println(ht1);

//        HashMap<Integer,String> ht2 = new HashMap<>();
//        ht2.put(1, "one");
//        ht2.put(2, "two");
//        ht2.put(3, "three");
//        ht2.put(3, null);
//        System.out.println(ht2);
        Integer n = ht1.get("two");
        if (n != null) {
            System. out. println("two = " + n);
        }

        //

//        Enumeration<Integer> e = ht1.keys();
//        while (e.hasMoreElements()){
//            System.out.println(e.nextElement());
//            System.out.println(ht1.get(e.nextElement()));
//        }


    }
}
