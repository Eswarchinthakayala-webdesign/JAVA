package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Breadth : ");
        float breadth=input.nextFloat();
        System.out.print("Enter the Height : ");
        float height=input.nextFloat();
        double area=breadth*height;
        System.out.println("Area of Rectangle: "+area);



    }
}
