package com.java.oop.staticPolymorphism;

import java.util.logging.Logger;

// compile time polymorphism = static polymorphism
public class MethodOverloading {

    Logger log = Logger.getLogger(this.getClass().getName());

    public void demo(int a){
        log.info("a: " + a);
    }

    public void demo(int a, int b){
        log.info("a and b: "+ a + "," + b);
    }

    public double demo(double a) {
        log.info("double a: " + a);
        return a*a;
    }

    public static void main(String[] args){
        MethodOverloading obj = new MethodOverloading();

        double result;
        obj.demo(10);
        obj.demo(10, 20);
        result = obj.demo(5.5);

        System.out.println("O/P: " + result);
    }
}
