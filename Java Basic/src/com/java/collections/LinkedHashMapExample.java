package com.java.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {

    public static void main(String[] args){

        LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<>();

        lhmap.put(22, "Abey");
        lhmap.put(33, "Dawn");
        lhmap.put(1, "Sherry");
        lhmap.put(2, "Karon");
        lhmap.put(100, "Jim");

        Set set = lhmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("Key is: "+ mentry.getKey() +
                    "& Value is: "+mentry.getValue()+"\n");
        }
    }
}
