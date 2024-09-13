package com.Code;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int salary=24000;
       if(salary>20000)
       {
           salary+=4000;
       }
       else if(salary>10000)
       {
           salary+=2000;
       }
       else
       {
           salary+=1000;
       }

        System.out.println("Updated Salary: "+salary);
    }
}
