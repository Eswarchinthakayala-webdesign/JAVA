package com.Eswar;

import java.util.Arrays;

public class Recursion {


    public static void main(String[] args) {

        int[] nums={10,80,30,90,40,50,70};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

   static void quickSort(int[] nums,int start,int end) {
        if(start>=end)
        {
            return;
        }
        int left=start;
        int right=end;
        int mid=left+(right-left)/2;
        int pivot=nums[mid];
        while(left<=right)
        {
            while(nums[left]<pivot)
            {
                left++;
            }
            while(nums[right]>pivot)
            {
                right--;
            }
            if(left<=right)
            {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
            quickSort(nums,start,right);
            quickSort(nums,left,end);
        }
    }
}
