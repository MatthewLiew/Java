package com.java.basic;

public class Exception {

    public void calculation() throws java.lang.Exception {
        int numl = 30, num2 = 0;
        int output = numl/num2;
        System.out.println("Result: " + output);
    }

    public void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Not Eligible for voting");
        } else {
            System.out.println("Eligible for voting");
        }
    }

    public static void main(String[] args){
        Exception example1 = new Exception();

        try {
            example1.calculation();
        } catch (java.lang.Exception e){
            System.out.println("You shouldn't divide a number by zero");
            e.printStackTrace();
        }

        try {
            example1.checkAge(13);
        } catch (java.lang.Exception e){ // catch exception is to prevent program stop 
            e.printStackTrace();
        }

        System.out.println("End of the Program");
    }
}
