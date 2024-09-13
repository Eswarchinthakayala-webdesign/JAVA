package com.Code;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter the Number: ");
       long num=input.nextLong();
        System.out.print("Enter the Number to Find Frequency: ");
        int fre=input.nextInt();
       int count=0;
       while(num>0)
       {
           long r=num%10;
           if((int)r==fre) {
               count =count+1;
           }
           num=num/10;
       }
        System.out.println("Frequency of "+fre+" is "+count);
    }
}
