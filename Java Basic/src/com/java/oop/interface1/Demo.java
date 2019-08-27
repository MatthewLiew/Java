package com.java.oop.interface1;

import java.util.logging.Logger;

public class Demo implements MyInterface {

    Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public void method1() {
        log.info("implementation of method1");
    }

    @Override
    public void method2() {
        log.info("implementation of method2");
    }

    public static void main(String[] args){
        MyInterface obj = new Demo();
        obj.method1();
    }
}
