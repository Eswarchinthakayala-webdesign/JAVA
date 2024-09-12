package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        float p=input.nextFloat();
        System.out.print("Enter the Time: ");
        float t=input.nextFloat();
        System.out.print("Enter the Rate of Interest: ");
        float r=input.nextFloat();

        float interest=(p*t*r)/100;
        System.out.println("Simple Interest: "+interest);
    }
}
