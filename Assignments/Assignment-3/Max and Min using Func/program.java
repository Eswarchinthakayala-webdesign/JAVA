package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Number-1: ");
        int a=in.nextInt();
        System.out.print("Enter Number-2: ");
        int b=in.nextInt();
        System.out.print("Enter Number-3: ");
        int c=in.nextInt();

        int max=maxNum(a,b,c);
        int min=minNum(a,b,c);
        System.out.println("Maximum Number is: "+max);
        System.out.println("Minimum Number is: "+min);

    }

  static int minNum(int a, int b, int c) {

        if(a<b && a<c)
        {
            return a;
        }
        else if(b<a && b<c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }

    static int maxNum(int a, int b, int c) {
        if(a>b && a>c)
        {
            return a;
        }
        else if(b>a && b>c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }

}
