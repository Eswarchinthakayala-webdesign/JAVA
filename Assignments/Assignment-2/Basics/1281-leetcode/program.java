package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        int sum=0;
        int pro=1;
        while (num > 0)
        {
            int r=num%10;
            sum=sum+r;
            pro=pro*r;
            num=num/10;
        }
        int result=pro-sum;
        System.out.println("Result: "+result);
    }
}
