package com.java.java8.methodReferences;

interface MyInterface{
    void display();
}

// Method reference to an instance method of an object
public class Example1 {

    public void myMethod(){
        System.out.println("Instance Method");
    }

    public static void main(String[] args){

        Example1 obj = new Example1();

        // Method reference using the object of the class
        MyInterface ref = obj::myMethod;

        // Calling the method of functional interface
        ref.display();
    }
}
