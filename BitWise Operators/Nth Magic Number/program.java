package com.Eswar;

import java.util.Arrays;

public class BitWise {
    public static void main(String[] args) {
        int n=4;
        int ans=getNthMagicNumber(n);
        System.out.println(ans);
    }

 static int getNthMagicNumber(int n) {
        int total=0;
        int p=1;
        while(n>0)
        {
            total+=(n&1)*(Math.pow(5,p));
            p++;
            n>>=1;

        }
        return total;
    }

}
