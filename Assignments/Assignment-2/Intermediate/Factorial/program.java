package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        long n=input.nextInt();
        long fact=1;
        if(n==0 || n==1)
        {
            System.out.println("Factorial of "+n+" is 1");
        }
        else {
            for (long i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }

        System.out.println("Factorial of "+n+" is :"+fact);

    }
}
