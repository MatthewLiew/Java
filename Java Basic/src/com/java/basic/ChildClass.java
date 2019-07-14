package com.java.basic;

public class ChildClass extends ParentClass{

//    private String name = "mzxi2";

    private ChildClass() {
        super();
    }

    public String getName(){
        return this.name;
    }

    public static void main(String[] args){

        ChildClass childClass = new ChildClass();
//        childClass.setName("mzxi2");
        System.out.println(childClass.getAge());
        System.out.println(childClass.getName());
//        System.out.println(getName());
    }
}
