package com.java.java8.lambdaExpression;

interface MyFunctionalInterface1{

    public String sayHello();
}
public class Example1 {

    public static void main(String[] args){

        // lambda expression
        MyFunctionalInterface1 msg = () -> "Hello";

        MyFunctionalInterface1 old = new MyFunctionalInterface1() {
            @Override
            public String sayHello() {
                return "Hello";
            }
        };

        System.out.println(msg.sayHello());
        System.out.println(old.sayHello());
    }
}
