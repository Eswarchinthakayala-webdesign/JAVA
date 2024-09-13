package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,sum=0;
        int max=0;
        while(true)
        {
            System.out.print("Enter (0 to Stop): ");
            number=input.nextInt();
            if(number==0)
            {
                break;
            }
            else if(number>max) {
                max=number;
        }

        }
        System.out.println("Maximum Number is: "+max);

    }
}
