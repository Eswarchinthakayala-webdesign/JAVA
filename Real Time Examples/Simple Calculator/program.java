package com.Code;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("------------Simple Calculator--------------");
        System.out.println("Press 'X' or 'X' to stop");

        while(true) {

            System.out.print("Enter the Operator: ");
            char option=input.next().trim().charAt(0);
            if(option=='+'||option=='-'||option=='*'||option=='/'||option=='%')
            {
                System.out.print("Enter the First Number: ");
                int num1=input.nextInt();
                System.out.print("Enter the Second Number: ");
                int num2=input.nextInt();
                int ans=0;
                if(option=='+')
                {
                     ans=num1+num2;
                }
                else if(option=='-')
                {
                    ans=num1-num2;
                }
                else if(option=='*')
                {
                    ans=num1*num2;
                }
                else if(option=='/') {
                    if (num2 == 0) {
                        System.out.println("Division by is not Possible..");
                        continue;
                    } else {
                        ans = num1 / num2;
                    }
                }

                else if(option=='%')
                {
                    if(num2==0)
                    {
                        System.out.println("It is not Possible for modulus");
                        continue;
                    }
                    else
                    {
                        ans=num1%num2;
                    }
                }
                System.out.println("Answer: "+ans);

            }

            else if(option=='x'||option=='X')
            {
                break;
            }
            else
            {
                System.out.println("Invalid Operator");
            }

        }
    }
}
