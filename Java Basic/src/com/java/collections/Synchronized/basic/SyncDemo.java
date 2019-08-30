package com.java.collections.Synchronized.basic;

public class SyncDemo {

    public static void main(String[] args){

        Sender sender = new Sender();

        ThreadedSend s1 = new ThreadedSend("Hi", sender);
        ThreadedSend s2 = new ThreadedSend("Bye", sender);

        s1.start();
        s2.start();

        // wait for threads to end
        try
        {
            s1.join();
            s2.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
    }
}
