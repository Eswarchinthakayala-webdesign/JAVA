package com.Eswar;

public class Searching {
    public static void main(String[] args) {
        int [] arr={18,12,-7,3,14,28};
        System.out.println(findMin(arr));
    }

 static int findMin(int[] arr) {
        int min_value=arr[0];
     for (int i = 1; i < arr.length; i++) {
         if(arr[i]<min_value)
         {
             min_value=arr[i];
         }
     }
     return min_value;
    }
}
