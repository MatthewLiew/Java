package com.java.java8.lambdaExpression;

interface MyFunctionalInterface2{

    public int incrementByFive(int a);
}
public class Example2 {

    public static void main(String[] args){

        MyFunctionalInterface2 f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));
    }
}
