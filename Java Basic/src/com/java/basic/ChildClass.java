package com.java.basic;

public class ChildClass extends ParentClass{

    private ChildClass() {
        super();
    }

    public String name;

    public int age;

//    @Override
//    public void printName(){
//        System.out.println(super.getName());
//        System.out.println("Child: "+this.getName());
//    }

    @Override
    public String getName() {
        System.out.println(super.getName());
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge(){
        System.out.println(super.age);
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public void childMethod(){
        System.out.println("Child Methid");
    }

    public static void main(String[] args){

        ChildClass childClass = new ChildClass();
        childClass.setName("mzxi2");
        childClass.setAge(33);

        System.out.println(childClass.getName());
        System.out.println(childClass.getAge());


        ParentClass parentClass = new ParentClass();
//        parentClass.setName("mzxi3");
        System.out.println(parentClass.getName());
        System.out.println(parentClass.getAge());

        ParentClass parent = new ChildClass();
        parent.getName();
        // cannot assign parent to children
        //ChildClass child = new ParentClass();


    }
}
