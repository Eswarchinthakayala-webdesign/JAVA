package com.Code;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);

//Larges of three numbers
        System.out.print("Enter A: ");
        int a=input.nextInt();
        System.out.print("Enter B: ");
        int b=input.nextInt();
        System.out.print("Enter C: ");
        int c=input.nextInt();
        if(a>b && a>c)
        {
            System.out.println("A is Greater than B and C");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is Greater than A and C");
        }
        else
        {
            System.out.println("C is Greater than B and A");
        }



    }
}
