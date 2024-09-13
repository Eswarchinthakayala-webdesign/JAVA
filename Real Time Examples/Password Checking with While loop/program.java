package com.Code;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);


       String org="secure123";
       boolean isAuthenticated=false;
       while(!isAuthenticated){
           System.out.print("Enter the Password: ");
           String password=input.next();
       if(password.equals(org))

       {
           System.out.println("Login Successfully");
           isAuthenticated=true;
       }
       else
       {
           System.out.println("Incorrect Password");
       }
       }


    }
}
