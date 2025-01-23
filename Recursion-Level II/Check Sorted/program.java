package com.Eswar;

public class Recursion {

    public static void main(String[] args) {

        int[] nums={1,4,5,7,8,9};
        boolean ans=checkSorted(nums,0);
        System.out.println(ans);

    }

   static boolean checkSorted(int[] nums,int n) {
        if (n==nums.length-1)
        {
            return true;
        }

        return nums[n]<nums[n+1]&&checkSorted(nums,n+1);
    }

}
