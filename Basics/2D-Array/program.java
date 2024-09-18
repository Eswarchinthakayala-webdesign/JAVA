package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class PassingFunctions {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][] arr=new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[i].length;j++)
            {
                System.out.print("Enter the Element["+(i+1)+"]["+(j+1)+"]: ");
                arr[i][j]=input.nextInt();
            }

        }
        System.out.println("--------------2D-Array------------");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

