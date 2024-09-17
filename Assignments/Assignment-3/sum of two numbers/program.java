package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number-1: ");
        int a=input.nextInt();
        System.out.print("Enter the Number-2: ");
        int b=input.nextInt();
        int result=add(a,b);
        System.out.println("Sum: "+result);
    }

 static int add(int a,int b) {
        return  a+b;
    }

}
