package com.Code;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int option;
       do {

           System.out.println("Menu:");
           System.out.println("1.Start");
           System.out.println("2.Settings");
           System.out.println("3.Exit");
           System.out.print("Choose one option (1-3): ");
           option=input.nextInt();
           switch(option)
           {
               case 1:
                   System.out.println("Starting Program");
                   break;
               case 2:
                   System.out.println("Opening Settings");
                   break;
               case 3:
                   System.out.println("Closing Program");
                   break;
               default:
                   System.out.println("Invalid Option...Try Again");
           }
       }while(option!=3);



    }
}
