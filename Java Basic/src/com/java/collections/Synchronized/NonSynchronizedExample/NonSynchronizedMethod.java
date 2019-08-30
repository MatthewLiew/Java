package com.java.collections.Synchronized.NonSynchronizedExample;

public class NonSynchronizedMethod {

    public void printNumbers(){
        System.out.println("String to print Numbers for "+ Thread.currentThread().getName());

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

        System.out.println("Completed printing Numbers for " + Thread.currentThread().getName());
    }
}

class ThreadOne extends Thread{
    NonSynchronizedMethod nonSynchronizedMethod;

    public ThreadOne(NonSynchronizedMethod nonSynchronizedMethod) {
        this.nonSynchronizedMethod = nonSynchronizedMethod;
    }

    @Override
    public void run() {
        nonSynchronizedMethod.printNumbers();
    }
}

class ThreadTwo extends Thread {
    NonSynchronizedMethod nonSynchronizedMethod;

    public ThreadTwo(NonSynchronizedMethod nonSynchronizedMethod) {
        this.nonSynchronizedMethod = nonSynchronizedMethod;
    }

    @Override
    public void run() {
        nonSynchronizedMethod.printNumbers();
    }
}
