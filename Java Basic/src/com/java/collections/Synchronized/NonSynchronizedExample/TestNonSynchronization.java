package com.java.collections.Synchronized.NonSynchronizedExample;

public class TestNonSynchronization {

    public static void main(String[] args){

        NonSynchronizedMethod nonSynchronizedMethod = new NonSynchronizedMethod();

        ThreadOne threadOne = new ThreadOne(nonSynchronizedMethod);
        threadOne.setName("ThreadOne");

        ThreadTwo threadTwo = new ThreadTwo(nonSynchronizedMethod);
        threadTwo.setName("ThreadTwo");

        threadOne.start();
        threadTwo.start();
    }
}


