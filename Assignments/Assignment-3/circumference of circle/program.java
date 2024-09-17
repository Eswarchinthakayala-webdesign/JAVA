package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double r=input.nextFloat();
        double result=circumference(r);
        System.out.println("Circumference: "+result);

    }

  static double circumference(double r) {
        return 2*Math.PI*r;
    }


}
