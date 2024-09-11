package com.Eswar;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Type Conversion");
        System.out.print("Enter the Integer: ");
        float num=input.nextInt();
        System.out.println("Gives Float Value: "+num);
        System.out.println("Type Casting ");
        System.out.print("Enter the Float Value: ");
        float num1=input.nextFloat();
        int num2=(int)(num1);
        System.out.println("Gives Integer Value: "+num2);

    }
}
