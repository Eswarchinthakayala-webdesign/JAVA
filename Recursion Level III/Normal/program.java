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
            getPattern(r,c+1);
            System.out.print("*"+" ");

        }
        else {

            getPattern(r - 1, 0);
            System.out.println();


        }

    }
}
