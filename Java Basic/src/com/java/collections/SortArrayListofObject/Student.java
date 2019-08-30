package com.java.collections.SortArrayListofObject;

import java.util.Comparator;

public class Student {

    private String studentName;
    private int rollNo;
    private int studentAge;

    public Student(int rollNo, String studentName, int studentAge) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", rollNo=" + rollNo +
                ", studentAge=" + studentAge +
                '}';
    }

    // using anonymous inner class as implementation of the specified interface
    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            String stuName1 = o1.getStudentName().toUpperCase();
            String stuName2 = o2.getStudentName().toUpperCase();

            return stuName1.compareTo(stuName2);
        }
    };

    // another form of writing comparator
    static class StudentNameComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            String stuName1 = o1.getStudentName().toUpperCase();
            String stuName2 = o2.getStudentName().toUpperCase();

            return stuName1.compareTo(stuName2);
        }
    }

    public static Comparator<Student> StuRollNoComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            int rollNo1 = o1.getRollNo();
            int rollNo2 = o2.getRollNo();

            return rollNo1-rollNo2;
        }
    };
}
