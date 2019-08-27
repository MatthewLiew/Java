package com.java.oop.dynamicPolymorphism;

import java.util.logging.Logger;

// run time polymorphism = dynamic polymorphism
public class Horse extends Animal {

    Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public void sound() {
        log.info("Neigh");
    }

    public static void main (String[] args){
        Animal obj = new Horse();
        obj.sound();
    }
}
