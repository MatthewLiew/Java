package com.java.oop.dynamicPolymorphism;

import java.util.logging.Logger;

// run time polymorphism = dynamic polymorphism
public class Cat extends Animal {

    Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public void sound() {
        log.info("Meow");
    }

    public static void main(String[] args){
        Animal obj = new Cat();
        obj.sound();
    }
}
