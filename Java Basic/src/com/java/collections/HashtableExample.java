package com.java.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableExample {

    public static void main(String[] args) {

        Enumeration names;
        String key;

        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("Key1", "Chaitanya");
        hashtable.put("Key2", "Ajeet");
        hashtable.put("Key3", "Peter");
        hashtable.put("Key4", "Ricky");
        hashtable.put("Key5", "Mona");

        names = hashtable.keys();
        while(names.hasMoreElements()){
            key = (String)names.nextElement();
            System.out.println("Key: " +key+ " & Value: " +
                    hashtable.get(key));
        }
    }
}
