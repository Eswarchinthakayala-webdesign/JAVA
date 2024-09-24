package com.Eswar;

import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{4,5,6,7},{-3,-4,-9}};
        int target=-9;
        int [] result=findElement(arr,target);
        System.out.println(Arrays.toString(result));
    }

   static int[] findElement(int[][] arr, int target) {

       for (int i = 0; i < arr.length; i++) {
           for(int j=0;j<arr[i].length;j++)
           {
               if(target==arr[i][j])
               {
                   return new int[] {i,j};
               }

       }

    }
       return new int []{};
    }
}
