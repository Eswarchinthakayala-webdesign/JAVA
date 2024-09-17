package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    static int x=40;
    public static void main(String[] args) {
        System.out.println("Before Shadowing: "+x);
        int x=30;
        System.out.println("After Shadowing: "+x);
        fun();
    }
    static void fun()
    {
        System.out.println("X in Super Class: "+x);
    }

}
