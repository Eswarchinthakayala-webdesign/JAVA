package com.Eswar;

import java.util.Arrays;

public class BitWise {
    public static void main(String[] args) {
        //No of Digits in base k
        int num=6;
        int base=2;
        int ans=noOfDigits(num,base);
        System.out.println(ans);
    }

 static int noOfDigits(int num,int base) {
        return (int)(Math.log(num)/Math.log(base))+1;
    }
}
