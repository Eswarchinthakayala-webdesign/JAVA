package com.Eswar;

import java.util.Arrays;

public class Recursion {


    public static void main(String[] args) {

        int[] arr={8,3,4,12,5,6};
        mergeSortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void mergeSortInplace(int[]arr,int s,int e)
    {
        if(e-s==1)
        {
            return;
        }
        int mid=s+(e-s)/2;
        mergeSortInplace(arr,s,mid);
        mergeSortInplace(arr,mid,e);
        mergeInPlace(arr,s,mid,e);
    }

     static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int[]mix=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid && j<e)
        {
            if(arr[i]<arr[j])
            {
                mix[k]=arr[i];
                i++;
            }
            else
            {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
         while(i<mid)
         {
             mix[k]=arr[i];
             i++;
             k++;
         }
         while(j<e)
         {
             mix[k]=arr[j];
             j++;
             k++;
         }
         for (int l = 0; l < mix.length; l++) {
             arr[s+l]=mix[l];
         }
    }

    static int[] merge(int[] left, int[] right) {

        int [] mergedArr=new int[left.length+right.length];
        int j=0;
        int i=0;
        int k=0;
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                mergedArr[k]=left[i];
                i++;
            }
            else
            {
                mergedArr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length)
        {
            mergedArr[k]=left[i];
            i++;
            k++;
        }
       while(j<right.length)
       {
           mergedArr[k]=right[j];
           j++;
           k++;
       }
       return mergedArr;
    }
}
