package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        //finding square root
        int n=40;
        int ans=findSqrt(n);
        System.out.println(ans);

    }

     static int findSqrt(int n) {
            int l=1;
            int r=n;
            while(l<=r)
            {
                int mid=(l+r)/2;
                if(mid*mid==n)
                {
                    return mid;
                }
                if(mid*mid<n)
                {
                    l=mid+1;
                }
                else
                {
                    r=mid-1;
                }
            }
            return r;
        }
}



