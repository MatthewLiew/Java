package com.java.multithreading;

public class MultithreadingDemoRunnable implements Runnable{

    public void run(){
        System.out.println("My thread is in running state.");
    }

    public static void main(String[] args){
        MultithreadingDemoRunnable obj = new MultithreadingDemoRunnable();
        Thread tobj = new Thread(obj);
        tobj.start();
    }
}
class Count1 implements Runnable{

    Thread mythread;

    Count1(){
        mythread = new Thread(this, "my runnable thread");
        System.out.println("my thread created " + mythread);
        mythread.start();
    }

    @Override
    public void run() {
        try {
            for (int i=0 ;i<10;i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("mythread run is over" );
    }
}
class RunnableExample
{
    public static void main(String args[])
    {
        Count1 cnt = new Count1();
        try
        {
            while(cnt.mythread.isAlive())
            {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(5000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over" );
    }
}
