package com.Eswar;

public class OOPS {
    public static void main(String[] args) {

        Student std1=new Student();
        System.out.println(std1.rNo);
        System.out.println(std1.name);
        System.out.println(std1.marks);

    }

}
class Student
{
    int rNo;
    String name;
    float marks;
    Student()
    {
        this.rNo=13;
        this.name="Eswar";
        this.marks=90;
    }

}

