package com.Eswar;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={3,4,2,1,0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

 static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

}
