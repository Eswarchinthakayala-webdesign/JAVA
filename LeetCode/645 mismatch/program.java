package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
       int [] nums={8,7,3,5,3,6,1,4};
       int [] result=findMissing(nums);
        System.out.println(Arrays.toString(result));
    }

    static public int [] findMissing(int [] nums)
    {
        int index=0;
        while(index<nums.length)
        {

                if(nums[index]!=nums[nums[index]-1])
                {
                    int temp=nums[nums[index]-1];
                    nums[nums[index]-1]=nums[index];
                    nums[index]=temp;
                }

            else
            {
                index++;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                return new int[]{nums[j],j+1};
            }
        }
return new int[]{-1,-1};
    }

}
