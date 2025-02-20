package com.sriram.Polymorphism;

public class Main {
    int sum(int a,int b)
    {
        return a+b;

    }
    double sum(double a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
         Main obj=new Main();
        System.out.println(obj.sum(2,3));
        
    }
}
