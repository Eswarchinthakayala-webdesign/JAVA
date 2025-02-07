package com.Eswar;

public class OOPS {
    public static void main(String[] args) {

        Student std1=new Student();
        std1.greetings();
        Student std2=new Student(123,"Sriram",23.5f);
        std2.greetings();
        Student random=new Student(std2);
        random.greetings();
        Student random2=new Student();
        random2.greetings();

    }

}
class Student
{
    int rNo;
    String name;
    float marks;
  // constructor in constructor
  //internally:new Student()
    Student()
    {
        this(12,"Default Name",100.0f);

    }
    //passing class Argument

    Student(Student other)
    {
        this.name=other.name;
        this.rNo= other.rNo;
        this.marks=other.marks;
    }

    //constructor over loading
    Student(int rNo,String name,float marks)
    {  // this used to bind values even it has same variable names
       this.rNo=rNo;
       this.name=name;
     this.marks=marks;
    }

    void greetings()
    {
        System.out.println(rNo+" "+name+" "+marks);
    }

}

