package com.sriram.OOP3;

public class Box {

     double l;
     double w;
     double h;
    //default constructor
    Box()
    {
          this.l=-1;
          this.w=-1;
          this.h=-1;
    }
    //cube

    Box(double side)
    {
        this.l=side;
        this.h=side;
        this.w=side;
    }
    //others
    Box(double l,double w,double h)
    {
        this.l=l;
        this.w=w;
        this.h=h;

    }

    Box(Box old)
    {
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }

    static void Information()
    {

        System.out.println("Running the BOX");
    }


}
