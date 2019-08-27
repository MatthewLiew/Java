package com.java.oop.abstract1;

import java.util.logging.Logger;

public class Dog extends AbstractAnimal{

    Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public void sound() {
        log.info("Woof");
    }

    public static void main(String[] args){
        AbstractAnimal obj = new Dog();
        obj.sound();
    }

}
