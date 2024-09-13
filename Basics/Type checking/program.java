package com.Code;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("---------TYPE CHECKING------------");
        System.out.print("Enter the Letter: ");
       char ch=input.next().trim().charAt(0);
       if(ch>='a'&& ch<='z')
       {
           System.out.println("It is Lower Case");
       }
       else if(ch>='A'&& ch<='Z')
       {
           System.out.println("It is Upper Case");
       }
       else
       {
           System.out.println("It is Invalid Character");
       }







    }
}
