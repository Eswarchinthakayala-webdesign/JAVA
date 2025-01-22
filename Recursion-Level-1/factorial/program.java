package com.Eswar;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(fact(10));
    }

    static int fact(int n) {
        if(n==1)
        {
            return n;
        }
        System.out.println(n);
        return n*fact(n-1);

    }
}
