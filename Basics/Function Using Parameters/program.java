package com.Eswar;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int a=in.nextInt();
        System.out.print("Enter Number 2: ");
        int b=in.nextInt();
        System.out.println("Total Sum: "+add(a,b));


    }

    static int  add(int a ,int b)
    {
        int sum=a+b;
        return sum;
    }

}
