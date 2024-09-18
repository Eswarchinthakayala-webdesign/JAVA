package com.Sriram;

import java.util.Arrays;
import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        int [] arr=new int[10];
//        for (int i = 0; i <arr.length; i++) {
//
//            System.out.print("Enter the Element["+(i+1)+"] : ");
//            arr[i]=input.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//
//        }

        //Array of objects
        String [] str=new String[5];
        for(int i=0;i<str.length;i++)
        {
            System.out.print("Enter the String["+(i+1)+"] :");
            str[i]=input.next();
        }
        System.out.println(Arrays.toString(str));
        int a='a';
        System.out.println(a);
    }
}
