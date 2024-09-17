package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("-----Enter Numbers in Ascending  Order-----");
        System.out.print("Enter the Number-1: ");
        int a=input.nextInt();
        System.out.print("Enter the Number-2: ");
        int b=input.nextInt();
        System.out.print("Enter the Number-3: ");
        int c=input.nextInt();

        if(isPythagorean(a,b,c))
        {
            System.out.println("A Pythagorean Triplet");
        }
        else
        {
            System.out.println("Not Pythagorean Triplet");
        }

    }

 static boolean isPythagorean(int a, int b, int c) {
        double left=Math.pow((double)a,2)+Math.pow((double)b,2);
        double right=Math.pow((double)c,2);
        if(left==right)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
