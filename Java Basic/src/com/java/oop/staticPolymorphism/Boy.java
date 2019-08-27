package com.java.oop.staticPolymorphism;

public class Boy extends Human {

    public static void walk(){
        System.out.println("Boy walks");
    }

    public static void main(String[] args){

        // Both the classes have same method walk() but the method is static, which means it cannot be overriden
        // Because the reference is of Human type (parent class).
        // So whenever a binding of static, private and final methods happen, type of the class is determined
        Human human = new Human();
        Human boy = new Boy();

        human.walk();
        boy.walk();
    }
}
