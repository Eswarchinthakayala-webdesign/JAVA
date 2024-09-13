package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        double radius=input.nextDouble();
        double area=Math.PI*radius*radius;
        System.out.println("Area of Circle is:"+area);



    }
}
