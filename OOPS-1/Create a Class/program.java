package com.Eswar;

public class OOPS {
    public static void main(String[] args) {
    // to create a class and access properties in it


        Student student1=new Student();
        System.out.println(student1.rNo); //0
        System.out.println(student1.name); //null
        System.out.println(student1.marks); //0.0

    }

}
class Student
{
    int rNo;
    String name;
    float marks;
}

