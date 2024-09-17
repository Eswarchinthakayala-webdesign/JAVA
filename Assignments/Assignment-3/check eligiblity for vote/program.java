package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Age: ");
        int age=input.nextInt();
        Check(age);
    }

 static void Check(int age) {
        if(age>=18)
        {
            System.out.println("Eligible for Vote");
        }
        else
        {
            System.out.println("Not Eligible for Vote");
        }
    }

}
