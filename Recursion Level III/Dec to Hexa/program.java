package com.Eswar;
import java.util.*;

public class LeetCode {

    public static void main(String[] args) {

        int n=99;
        printConvert(n,16);
    }

 static void printConvert(int n, int base) {
        String conversion="0123456789ABCDEF";
        char digit=(char)(n%base);
        n/=16;
        if(n>0)
        {
            System.out.print(conversion.charAt(digit));
            printConvert(n,base);
        }
     System.out.println();
     System.out.print(conversion.charAt(digit));


    }
}
