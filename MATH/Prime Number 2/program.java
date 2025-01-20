package com.Eswar;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
       int n=40;
       int c=2;
        for (int i = 1; i <=n; i++) {
           if(isPrime(i))
           {
               System.out.print(i+" ");
           }

        }

    }

    private static boolean isPrime(int n) {
        if(n<=1)
        {
            return false;
        }
        int c=2;
        while(c*c<=n)
        {
            if(n%c==0)
            {

               return false;
            }
            c++;
        }
       return true;
    }
}



