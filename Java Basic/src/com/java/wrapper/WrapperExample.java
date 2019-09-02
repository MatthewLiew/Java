package com.java.wrapper;

public class WrapperExample {

    public static void main(String[] args){

        // Converting int primitive into Integer object
        int num = 100;
        Integer obj = Integer.valueOf(num);

        System.out.println(num + " " + obj);

        // converting the wrapper object to primitive
        Integer obj2 = new Integer(100);

        int num2 = obj.intValue();

        System.out.println(num + " " + obj);
    }
}
