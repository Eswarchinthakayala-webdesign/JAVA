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
        int result=prod(a,b);
        System.out.println("Product: "+result);
    }

 static int prod(int a,int b) {
        return  a*b;
    }

}
