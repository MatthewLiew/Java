package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExaample {

    public static void main(String[] args){

        HashSet<String> hset = new HashSet<>();

        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);

        Iterator iterator = hset.iterator();
        while(iterator.hasNext()){
            String value = (String)iterator.next();
            System.out.println("Value: "+ value);
        }
    }
}
