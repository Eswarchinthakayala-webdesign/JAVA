package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Base : ");
        float base=input.nextFloat();
        System.out.print("Enter the side: ");
        float side=input.nextFloat();
        double height=Math.sqrt((side*side)-(base*base)/4);
        double area=height*base/2;
        System.out.println("Area of Isosceles Triangle is: "+area);



    }
}
