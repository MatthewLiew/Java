package com.java.collections.Synchronized.SynchronizedExample;

public class SynchronizedMethod {

    public synchronized void printNumbers(){
        System.out.println("Starting to print Numbers for " + Thread.currentThread().getName());

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

        System.out.println("Completed printing Numbers for " + Thread.currentThread().getName());
    }

    public void minimizeSynchronizedPrintNumbers(){
        System.out.println("Starting to print Numbers for: " + Thread.currentThread().getName());

        synchronized(this){
            for (int i = 0; i < 5 ; i++) {
                System.out.println(Thread.currentThread().getName()+ ": " + i);
            }
        }

        System.out.println("Completed printing Numbers for: " + Thread.currentThread().getName());
    }
}
class SyncThreadOne extends Thread{
    SynchronizedMethod synchronizedMethod;

    public SyncThreadOne(SynchronizedMethod synchronizedMethod) {
        this.synchronizedMethod = synchronizedMethod;
    }

    @Override
    public void run() {
        synchronizedMethod.printNumbers();

        synchronizedMethod.minimizeSynchronizedPrintNumbers();
    }
}

class SyncThreadTwo extends Thread {
    SynchronizedMethod synchronizedMethod;

    public SyncThreadTwo(SynchronizedMethod synchronizedMethod) {
        this.synchronizedMethod = synchronizedMethod;
    }

    @Override
    public void run() {
        synchronizedMethod.printNumbers();

        synchronizedMethod.minimizeSynchronizedPrintNumbers();
    }
}
