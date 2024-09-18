package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        func(10.0,22,3,3,5,6,7);
    }
    static void func(double ...b)
    {
        System.out.println("second one");
        System.out.println(Arrays.toString(b));
    }
    static void func(int ...a)
    {
        System.out.println("First one ");
        System.out.println(Arrays.toString(a));
    }


}
