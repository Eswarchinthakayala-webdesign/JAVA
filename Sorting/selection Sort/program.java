package com.Eswar;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={5,3,2,1,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {

        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-1-i;
            int maxIndex=getIndex(arr,0,last);
            swap(arr,maxIndex,last);



    }
    }

 static void swap(int[] arr, int maxIndex, int last) {
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[last];
        arr[last]=temp;
    }

    static int getIndex(int[] arr, int start, int last) {
        int max=start;
        for(int i=start;i<=last;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
}
