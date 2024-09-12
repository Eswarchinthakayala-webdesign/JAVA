package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Length of Fibonacci Series : ");
        int n=input.nextInt();
        int a=0,b=1;
        int c;
        for(int i=1;i<=n;i++)
        {

            System.out.println(a);
            c=a+b;
            a=b;
            b=c;

        }





    }
}
