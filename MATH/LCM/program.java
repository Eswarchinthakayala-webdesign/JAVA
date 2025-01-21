package com.Eswar;
import java.util.*;

public class LeetCode {

    public static void main(String[] args) {
        int a=105;
        int b=224;
        int gcd=getGcd(a,b);
        int lcm=a*b/gcd;
        System.out.println(lcm);
        System.out.println(gcd);
    }

   static int getGcd(int a, int b) {
        if(a==0)
        {
            return b;
        }
        return getGcd(b%a,a);
    }
}
