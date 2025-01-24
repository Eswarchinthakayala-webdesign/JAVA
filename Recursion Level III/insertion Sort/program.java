package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion {


    public static void main(String[] args) {

        int [] nums={4,5,6,7,8,3,2,1};
        bubbleSort(nums,nums.length,0,0);
        System.out.println(Arrays.toString(nums));

    }

  static void bubbleSort(int[] nums,int n,int m,int max) {
        if(n==0)
        {
            return;
        }
        if(m<n)
        {
            if(nums[m]>nums[max])
            {
                bubbleSort(nums,n,m+1,m);
            }
            else
            {
                bubbleSort(nums,n,m+1,max);
            }


        }
        else
        {   int temp=nums[max];
            nums[max]=nums[n-1];
            nums[n-1]=temp;
            bubbleSort(nums,n-1,0,0);
        }
    }
}
