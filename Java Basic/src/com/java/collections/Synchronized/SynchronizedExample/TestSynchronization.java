package com.java.collections.Synchronized.SynchronizedExample;

public class TestSynchronization {

    public static void main(String[] args) {


        SynchronizedMethod synchronizedMethod = new SynchronizedMethod();

        SyncThreadOne syncThreadOne = new SyncThreadOne(synchronizedMethod);
        syncThreadOne.setName("syncThreadOne");

        SyncThreadTwo syncThreadTwo = new SyncThreadTwo(synchronizedMethod);
        syncThreadTwo.setName("syncThreadTwo");

        syncThreadOne.start();
        syncThreadTwo.start();
    }
}
