package com.java.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SendClass {

    public static void main(String[] args){

        Student obj = new Student(101, 25, "Chaitanya", "Agra", 6);

        try {
            FileOutputStream fos = new FileOutputStream("Student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
            System.out.println("Serialization Done!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
