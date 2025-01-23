package com.Eswar;

public class Recursion {

    public static void main(String[] args) {

        int[] nums={0};
        int target=0;
        boolean ans= searchEle(nums,target,0);
        System.out.println(ans);

    }

   static boolean searchEle(int[] nums, int target,int index) {
      if (index==nums.length)
      {
          return false;
      }
        return (nums[index]==target)||searchEle(nums,target,index+1);
    }

}
