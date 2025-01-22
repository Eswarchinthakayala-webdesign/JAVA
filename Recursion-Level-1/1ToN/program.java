package com.Eswar;

public class Recursion {

    public static void main(String[] args) {
        fun(5);

    }
    static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+"+");
        fun(n-1);

        System.out.print(n+"-");
    }
    static void funRev(int n)
    {
        if(n==0)
        {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
}
