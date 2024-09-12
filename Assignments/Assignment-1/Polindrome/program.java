package com.Eswar;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=input.next();
        String str1=str.toLowerCase();
        String reversed="";
        for(int i=str1.length()-1;i>=0;i--)
        {
            reversed+=str1.charAt(i);
        }
       if(str1.equals(reversed))
       {
           System.out.println("It is Polindrome");
       }
       else
       {
           System.out.println("It is not Polindrome");
       }




    }
}
