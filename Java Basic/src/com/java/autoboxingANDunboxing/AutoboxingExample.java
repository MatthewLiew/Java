package com.java.autoboxingANDunboxing;

import java.util.ArrayList;

public class AutoboxingExample {

    public static void myMethod(Integer num){
        System.out.println(num);
    }

    public static void main(String[] args){

        /* passed int (primitive type), it would be
         * converted to Integer object at Runtime
         */
        myMethod(2);

        Integer inum = 3; //Assigning int to Integer: Autoboxing

        Integer inum2 = Integer.valueOf(3); // Before java 1.5

        Long lnum = 32L; //Assigning long to Long: Autoboxing

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(11); //Autoboxing - int primitive to Integer
        arrayList.add(22); //Autoboxing
    }
}
