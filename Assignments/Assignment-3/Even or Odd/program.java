package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=input.nextInt();
        evenOrodd(num);
    }

 static void evenOrodd(int num) {
        if(num%2==0)
        {
            System.out.println("It is Even");
        }
        else
        {
            System.out.println("It is Odd");
        }
    }

}
