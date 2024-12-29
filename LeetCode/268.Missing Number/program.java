package com.Eswar;

import java.util.Arrays;

import static java.util.Collections.swap;

public class Practise
{
    public static void main(String[] args) {
            int [] nums={3,0,1,4};
            int missing=cyclicSort(nums);
        System.out.println(missing);

    }

static int cyclicSort(int[] nums) {
        int i=0;
       while(i<nums.length)
       {
           if(nums[i]<nums.length && nums[i]!=i)
           {

              int temp=nums[nums[i]];
              nums[nums[i]]=nums[i];
              nums[i]=temp;

           }
           else
           {
               i++;
           }
       }
    for (int j = 0; j < nums.length; j++) {
        if(nums[j]!=j)
        {
            return j;
        }

    }
    return nums.length;
    }
}
