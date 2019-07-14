package com.java.basic;

public class StaticVariable {

    public static String someValue = "this is some static values";

    public static void main(String[] args) {

        StaticVariable staticVariable1 = new StaticVariable();
        StaticVariable staticVariable2 = new StaticVariable();
        StaticVariable staticVariable3 = new StaticVariable();

        System.out.println(staticVariable1.someValue);
        System.out.println(staticVariable2.someValue);
        System.out.println(staticVariable3.someValue);

        staticVariable1.someValue = "static value changed";

        System.out.println(staticVariable1.someValue);
        System.out.println(staticVariable2.someValue);
        System.out.println(staticVariable3.someValue);

        System.out.println(someValue);

        System.out.println(OtherVariable.someOtherValue);

    }
}

class OtherVariable{

    public static String someOtherValue = "some other value";
}
