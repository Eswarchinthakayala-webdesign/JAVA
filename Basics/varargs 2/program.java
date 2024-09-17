package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8);
    }

 static void fun(int a,int b,int ...v) {
     System.out.println(Arrays.toString(v));
    }

}
