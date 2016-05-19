package com.smartosc.demo.core.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by HaiNv on 19/05/2016.
 */
public class Student implements Comparable<Student> {
    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentage = studentage;
        this.studentname = studentname;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentname='" + studentname + '\'' +
                ", rollno=" + rollno +
                ", studentage=" + studentage +
                '}';
    }


    public int compareTo(Student student) {
        //compare by age: ascending
        //return this.getStudentage() - student.getStudentage();
        // descending
        return student.getStudentage() - this.getStudentage();
    }

    public static void main(String[] args) {
        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student(223, "A", 26));
        arraylist.add(new Student(245, "B", 24));
        arraylist.add(new Student(209, "C", 32));

        // Sort by comparable interface
        // Collections.sort(arraylist);

        // Sort by comparator
        Collections.sort(arraylist, new ComparatorSort());

        for (Student student : arraylist) {
            System.out.println(student);
        }
    }
}

class ComparatorSort implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        return o1.getStudentname().compareTo(o2.getStudentname());
    }
}