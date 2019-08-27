package com.java.collections;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args){

        HashMap<Integer, String> hmap = new HashMap<>();

        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");

        // using entrySet
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        System.out.println("\nUsing hashmap.entrySet()");
        while(iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: " + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

        String var = hmap.get(2);
        System.out.println("Value at index 2 is: "+var);

        hmap.remove(3);
        System.out.println("Map key and values after removal:");

        // using keyset
        Set set2 = hmap.keySet();
        Iterator iterator2 = set2.iterator();
        System.out.println("\nUsing hashmap.keySet()");
        while(iterator2.hasNext()) {
            Integer key = (Integer)iterator2.next();
            System.out.print("Key is: "+key + " & Value is: ");
            System.out.println(hmap.get(key));
        }

        //using values
        Collection<String> values = hmap.values();
        System.out.println("\nUsing hashmap.values()");
        for(String a: values){
            System.out.println("Value is "+a);
        }
    }
}
