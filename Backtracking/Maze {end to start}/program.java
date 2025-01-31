package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Practise {
    public static void main(String[] args) {

       int path=getMazePath(2,2);
        System.out.println(path);

     }

   static int getMazePath(int r, int c) {
        if(r==0||c==0)
        {
            return 1;
        }
        int left=getMazePath(r,c-1);
        int right=getMazePath(r-1,c);
        return left+right;
    }
