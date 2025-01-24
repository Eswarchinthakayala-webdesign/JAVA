package com.Eswar;

import java.util.ArrayList;

public class Recursion {

    public static void main(String[] args) {
         int n=4;
         getPattern(n,0);

    }

 static void getPattern(int r, int c) {
        if(r==0 && c==0)
        {
            return;
        }
        if(c<r)
        {
            System.out.print("*"+" ");
            getPattern(r,c+1);
        }
        else {
            System.out.println();
            getPattern(r - 1, 0);

        }

    }
}
