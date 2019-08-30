package com.java.collections.Synchronized.basic;

public class Sender {

    public void send(String msg){
        System.out.println("Sending\t" +msg);
        try{
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("Thread interrupted");
        }
        System.out.println("\n" + msg + "Sent");
    }

    // example of whole send() block as synchronized
    public synchronized void send2(String msg){
        System.out.println("Sending\t" +msg);
        try{
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("Thread interrupted");
        }
        System.out.println("\n" + msg + "Sent");
    }

    // example of synchronized only part of the method
    public void send3(String msg)
    {
        synchronized(this)
        {
            System.out.println("Sending\t" + msg );
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println("Thread interrupted.");
            }
            System.out.println("\n" + msg + "Sent");
        }
    }
}
class ThreadedSend extends Thread {

    private String msg;
    private Thread t;
    Sender sender;

    public ThreadedSend(String msg, Sender obj) {
        this.msg = msg;
        this.sender = obj;
    }

    @Override
    public void run() {

        // Only one thread can send a message
        // at a time.
        // synchronize the Sender object inside the run() method of the ThreadedSend class
        synchronized(sender){
            // synchronizing the snd object
            sender.send(msg);
        }
    }
}
