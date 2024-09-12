package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=input.nextInt();
        int sum=0;
        while(num>0)
        {
            int r=num%10;
            sum+=r*r*r;
            num=num/10;

        }
       if(num==sum)
       {
           System.out.println("It is Armstrong Number");
       }
       else
       {
           System.out.println("It is not Armstrong Number");
       }




    }
}
