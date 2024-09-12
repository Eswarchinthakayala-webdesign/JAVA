package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a=input.nextInt();
        System.out.print("Enter the Second Number: ");
        int b=input.nextInt();
        System.out.println("Enter the Operator to Perform operation: ");
        char c=input.next().charAt(0);
        if( c == '+')
        {
            float res=a+b;
            System.out.println("Sum: "+res);
        }
        else if(c=='-')
        {
            float res=a-b;
            System.out.println("Difference: "+res);
        } else if (c=='*') {
            float res=a*b;
            System.out.println("product: "+res);

        } else if (c=='/') {
            float res=a/b;
            System.out.println("Division: "+res);
        }
        else
        {
            System.out.println("Invalid Operator");
        }
    }
}
