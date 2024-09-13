package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Base : ");
        float base=input.nextFloat();
        System.out.print("Enter the Height : ");
        float height=input.nextFloat();
        double area=(1/2f)*base*height;
        System.out.println("Area of Triangle: "+area);



    }
}
