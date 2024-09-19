package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class PassingFunctions {

    public static void main(String[] args) {
        int [] arr={ 1,2,3,4,5,8};
        System.out.println(max(arr));
    }

 static int max(int[] arr) {
        int max_value=arr[0];
         for (int i =1 ; i < arr.length; i++) {
             if(arr[i]>max_value)
             {
                 max_value=arr[i];
             }
         }
         return  max_value;
    }

}

