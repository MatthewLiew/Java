package com.java.oop.dynamicPolymorphism;

import java.util.logging.Logger;

// run time polymorphism = dynamic polymorphism
public class Animal {

    Logger log = Logger.getLogger(this.getClass().getName());
    public void sound(){
        log.info("Animal is making a sound");
    }
}
