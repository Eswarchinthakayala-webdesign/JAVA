package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Starting: ");
        int start=input.nextInt();
        System.out.print("Enter the Ending: ");
        int end=input.nextInt();
        printPrimes(start,end);


    }

 static void printPrimes(int start, int end) {
        int count;

        for(int i=start;i<=end;i++)
        {
            count=0;
            for(int j=2;j<i-1;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println("Prime: "+i);
            }
            else
            {
                System.out.println("Not Prime: "+i);
            }
        }
    }


}
