package com.Eswar;

import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{4,5,6,7},{-3,-4,-9}};
        int target=-9;
        int  result=findElement(arr,target);
        System.out.println(result);
    }

   static int findElement(int[][] arr, int target) {
       int max=Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++) {
           for(int j=0;j<arr[i].length;j++)
           {
               if(max<arr[i][j])
               {
                   max=arr[i][j];
               }

       }

    }
       return  max;
    }
}
