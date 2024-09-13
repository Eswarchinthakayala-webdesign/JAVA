package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=input.nextInt();
        System.out.println("Factors of "+num+" are :");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }





        




    }
}
