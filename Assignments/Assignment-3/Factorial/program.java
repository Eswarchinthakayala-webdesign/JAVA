package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=input.nextInt();
        int result=factorial(num);
        System.out.println("Factorial: "+result);


    }

   static int factorial(int num) {
        if(num==0 || num==1)
        {
            return 1;
        }
        else
       {
           return num*factorial(num-1);
       }
    }


}
