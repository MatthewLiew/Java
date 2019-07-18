package com.java.basic;

public class ParentClass {

    public ParentClass(){
        age = 26;
        name = "mzxi";
    }
    public int age;

    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name + " hello";
    }

    public void setName(String name) {
        System.out.println("Parent set");
        this.name = name;
    }

//    public void printName(){
//        System.out.println("Class: "+ this.getName());
//    }
}
