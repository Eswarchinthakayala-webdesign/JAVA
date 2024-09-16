package com.Eswar;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter A: ");
        int a=in.nextInt();
        System.out.print("Enter B: ");
        int b=in.nextInt();


        swap(a,b);
    }

    static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("A :"+a);
        System.out.println("B :"+b);
    }

}
