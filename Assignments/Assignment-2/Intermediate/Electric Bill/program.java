package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Units Consumed: ");
        double units=input.nextDouble();
        System.out.print("Enter the Cost per Unit: ");
        double cost=input.nextDouble();
        System.out.print("Enter Fixed Charges or Taxes: ");
        double charges=input.nextDouble();

        double price=(units*cost)+charges;
        System.out.println("Electric Bill is: "+price);


    }
}
