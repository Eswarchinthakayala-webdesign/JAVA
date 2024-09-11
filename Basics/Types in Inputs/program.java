package com.Inputs;
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int num=input.nextInt();
        System.out.print("Enter the Float: ");
        float marks=input.nextFloat();
        System.out.print("Enter the String: ");
        String name=input.next();
        System.out.print("Enter the Sentence: ");
        input.nextLine();
        String sen=input.nextLine();
        System.out.println("Integer is:"+num);
        System.out.println("Float is: "+marks);
        System.out.println("String: "+name);
        System.out.println("Sentence : "+sen);


    }
}
