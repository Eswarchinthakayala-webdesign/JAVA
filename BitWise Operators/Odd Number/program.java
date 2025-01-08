package com.Eswar;

public class BitWise {
    public static void main(String[] args) {
        int n=14;
        boolean ans=isOdd(n);
        System.out.println(ans);
    }

    static boolean isOdd(int n) {
        return (n&1)==1;
    }

}
