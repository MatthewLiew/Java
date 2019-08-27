package com.java.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args){
        Vector<String> vector = new Vector<>(2);

        vector.addElement("Apple");
        vector.addElement("Orange");
        vector.addElement("Mango");
        vector.addElement("Fig");

        System.out.println("Size is: "+vector.size());
        System.out.println("Default capacity increment is: "+vector.capacity());

        vector.addElement("fruit1");
        vector.addElement("fruit2");
        vector.addElement("fruit3");

        System.out.println("Size after addition: "+vector.size());
        System.out.println("Capacity after increment is: "+vector.capacity());

        Enumeration en = vector.elements();
        System.out.println("\nElements are:");
        while(en.hasMoreElements()){
            System.out.print(en.nextElement() + " ");
        }
    }
}
