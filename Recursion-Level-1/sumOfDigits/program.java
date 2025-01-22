package com.Eswar;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123443));
    }

    static int sumOfDigits(int n) {
        if(n<=0)
        {
            return n;
        }
        return n%10+sumOfDigits(n/10);
    }
}
