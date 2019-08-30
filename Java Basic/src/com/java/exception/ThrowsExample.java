package com.java.exception;

import java.util.logging.Logger;

public class ThrowsExample {

    public int division(int a, int b) throws ArithmeticException{
        int t = a/b;
        return t;
    }

    public static void main(String args[]){

        ThrowsExample obj = new ThrowsExample();
        try{
            System.out.println(obj.division(15, 0));
        } catch (ArithmeticException e){
            System.out.println("You shouldn't divide number by zero");
            // log.error("Exception : {}", e.getMessage(), e);
            e.printStackTrace();
        }

    }
}
