package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Rupees : ");
        float cur=input.nextFloat();

        double USD=cur*(0.012);
        System.out.println("Currency in USD: "+USD);




    }
}
