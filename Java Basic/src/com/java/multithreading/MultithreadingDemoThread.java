package com.java.multithreading;

public class MultithreadingDemoThread extends Thread {

    public void run(){
        System.out.println("My thread is in running state.");
    }

    public static void main(String[] args){

        MultithreadingDemoThread obj = new MultithreadingDemoThread();
        obj.start();
    }
}
class Count extends Thread{

    Count(){
        super("my extending thread");
        System.out.println("my thread created " + this);
        start();
    }

    public void run(){
        try{

            for (int i=0 ;i<10;i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e){
            System.out.println("my thread interrupted");
        }

        System.out.println("My thread run is over");
    }
}

class ExtendingExample {

    public static void main(String[] args){
        Count cnt = new Count();

        try{
            while(cnt.isAlive()){
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(5000);
            }
        } catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over");
    }
}