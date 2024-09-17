package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=input.nextInt();
        int result=palindrome(num);
        if(result==num)
        {
            System.out.println("It is Palindrome");
        }
        else
        {
            System.out.println("It is not Palindrome");
        }
    }

 static int palindrome(int num) {
        int r,sum=0;
        while(num>0)
        {
            r=num%10;
            sum=sum*10+r;
            num=num/10;

        }
        return sum;
    }


}
