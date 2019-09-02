package com.java.autoboxingANDunboxing;

import java.util.ArrayList;

public class UnboxingExample {

    public static void myMethod(int num){
        System.out.println(num);
    }

    public static void main(String[] args){

        Integer inum = new Integer(100);

        /* passed Integer wrapper class object, it
         * would be converted to int primitive type
         * at Runtime
         */
        myMethod(inum);

        Integer inum2 = new Integer(5);
        int num = inum2; //unboxing object to primitive conversion

        int num2 = inum2.intValue(); // Before java 1.5

        ArrayList<Integer> arrayList = new ArrayList();
        int num3 = arrayList.get(0); // unboxing because get method returns an Integer object
    }
}
