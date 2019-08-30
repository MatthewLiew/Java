package com.java.collections.SortArrayListofObject;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListOfObjectUsingComparator {

    public static void main(String[] args){

        ArrayList<Student> arraylist = new ArrayList<>();

        arraylist.add(new Student(101, "Zues", 26));
        arraylist.add(new Student(505, "Abey", 24));
        arraylist.add(new Student(809, "Vignesh", 32));

        System.out.println("Student Name Sorting: ");
        Collections.sort(arraylist, Student.StuNameComparator);

        for(Student stu: arraylist){
            System.out.println(stu);
        }

        System.out.println("Student Name Sorting: ");
        Collections.sort(arraylist, new Student.StudentNameComparator());

        for(Student stu: arraylist){
            System.out.println(stu);
        }

        System.out.println("RollNum Sorting: ");
        Collections.sort(arraylist, Student.StuRollNoComparator);
        for(Student stu: arraylist){
            System.out.println(stu);
        }
    }
}
