package com.Sriram;

import java.util.Arrays;
import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] arr=new int[10];
        for (int i = 0; i <arr.length; i++) {

            System.out.print("Enter the Element["+(i+1)+"] : ");
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
