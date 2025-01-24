package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion {


    public static void main(String[] args) {

        int [] nums={4,5,6,7,8,3,2,1};
        bubbleSort(nums,nums.length,0);
        System.out.println(Arrays.toString(nums));

    }

  static void bubbleSort(int[] nums,int n,int m) {
        if(n==0)
        {
            return;
        }
        if(m<n-1)
        {
            if(nums[m]>nums[m+1])
            {
                int temp=nums[m];
                nums[m]=nums[m+1];
                nums[m+1]=temp;
            }
            bubbleSort(nums,n,m+1);
        }
        else
        {
            bubbleSort(nums,n-1,0);
        }
    }
}
