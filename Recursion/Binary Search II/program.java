package com.Eswar;

public class Recursion {

    public static void main(String[] args) {
       int [] nums={1,2,3,4,5,6,7,8};
       int target=5;
       int index=binarySearch(nums,target,0,nums.length-1);
        System.out.println(index);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {

        if(start>end)
        {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        if(nums[mid]<target)
        {
            return binarySearch(nums,target,mid+1,end);
        }

        return binarySearch(nums,target,start,mid-1);
    }


}
