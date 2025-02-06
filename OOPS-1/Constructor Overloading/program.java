package com.Eswar;

public class OOPS {
    public static void main(String[] args) {

        Student std1=new Student();
        std1.greetings();
        Student std2=new Student(123,"Sriram",23.5f);
        std2.greetings();

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

    //constructor over loading
    Student(int roll,String naam,float m)
    {  // this used to bind values even it has same variable names
       this.rNo=roll;
       this.name=naam;
     this.marks=m;
    }

    void greetings()
    {
        System.out.println(rNo+" "+name+" "+marks);
    }

}

