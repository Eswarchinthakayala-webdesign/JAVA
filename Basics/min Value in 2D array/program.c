package com.Eswar;

public class Searching {
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{4,5,6,7},{-3,-4,-9}};
        System.out.println(findMin(arr));
    }

 static int findMin(int[][] arr) {
        int min_value=Integer.MAX_VALUE;
     for (int i = 0; i < arr.length; i++) {
         for(int j=0;j<arr[i].length;j++)
         {
             if(arr[i][j]<min_value)
             {
                 min_value=arr[i][j];
             }
         }

     }
    return min_value;

 }
}
