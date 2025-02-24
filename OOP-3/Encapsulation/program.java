package com.sriram.OOP3;

public class Encapsulation
{
   //Encapsulation
    //Process of Containing Information
    //Focus on internal Working
    //solving implementation level issues
    private int num;
    Encapsulation(int num)
    {
        this.num=num;
    }
    public int get()
    {
        return num;
    }
    public void set(int num)
    {
        this.num=num;
    }

    public static void main(String[] args) {

        Encapsulation en=new Encapsulation(23);
        System.out.println("Number is: "+en.get());
        en.set(34);
        System.out.println("Number is: "+en.get());

    }
}
