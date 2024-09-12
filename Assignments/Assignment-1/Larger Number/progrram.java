package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a=input.nextInt();
        System.out.print("Enter the Second Number: ");
        int b=input.nextInt();

        if(a>b)
        {
            System.out.println("A is Larger than B");
        }
        else
        {
            System.out.println("B is larger than A");
        }
    }
}
