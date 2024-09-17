package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Range: ");
        int n = input.nextInt();
        int result=sumNatural(n);
        System.out.println("Total Sum: "+result);
    }

 static int sumNatural(int n) {

        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }

}
