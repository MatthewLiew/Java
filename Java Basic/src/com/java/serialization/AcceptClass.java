package com.java.serialization;

import java.io.*;

public class AcceptClass {

    public static void main(String[] args){
        Student stud = null;

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            stud = (Student)ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }

        System.out.println("Student Name:"+ stud.getStuName());
        System.out.println("Student Age:"+ stud.getStuAge());
        System.out.println("Student Roll No:"+ stud.getStuRollNum());
        System.out.println("Student Address:"+ stud.getStuAddress());
        System.out.println("Student Height:"+ stud.getStuHeight());
    }
}
