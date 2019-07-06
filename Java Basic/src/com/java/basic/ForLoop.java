package com.java.basic;

public class ForLoop {

    public static void main(String[] args){
        int[] arrNumber = {1,3,5,7,9};

        // for loop - conventional iteration loop
        for (int i=0; i<arrNumber.length; i++){
            System.out.println("fori loop: " + arrNumber[i]);
        }

        // for loop - for each loop
        for (int number: arrNumber) {
            System.out.println("foreach loop: " + number);
        }
    }
}
