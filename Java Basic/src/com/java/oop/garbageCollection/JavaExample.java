package com.java.oop.garbageCollection;

public class JavaExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collection is performed by JVM");
    }

    public static void main(String[] args){

        JavaExample obj = new JavaExample();

        // assign null to obj, make the object become non reachable
        obj = null;

        JavaExample a = new JavaExample();
        JavaExample b = new JavaExample();

        b = a;
        System.gc();
    }
}
