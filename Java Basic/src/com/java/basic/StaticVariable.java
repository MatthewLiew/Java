package com.java.basic;

public class StaticVariable {

    public static String someStaticValue;
    public String someValue;

    public static void main(String[] args) {

        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();

        obj1.someStaticValue = "Static values";
        obj1.someValue = "Non-static values";

        obj2.someStaticValue = "80";
        obj2.someValue = "90";

        System.out.println(obj1.someStaticValue);
        System.out.println(obj1.someValue);
        System.out.println(obj2.someStaticValue);
        System.out.println(obj2.someValue);

        // can access straigt away without object
        System.out.println(OtherVariable.someOtherValue);

    }
}

class OtherVariable{

    public static String someOtherValue = "Values from other class";
}
