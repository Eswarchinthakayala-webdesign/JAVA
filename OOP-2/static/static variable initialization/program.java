package com.sriram.staticExample;

public class StaticInt {
    static int a=5;

    static int  b;
    
    static
    {
        System.out.println("It is static block");
    }

    public static void main(String[] args) {
        b=a*5;
        System.out.println(b);
    }

}
