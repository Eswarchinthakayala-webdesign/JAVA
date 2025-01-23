package com.Eswar;

public class Recursion {

    public static void main(String[] args) {

        int[] nums={1,3,2,6,7,9,0,9};
        int target=0;
        boolean ans= searchEle(nums,target,0);
        int res=findIndex(nums,target,0);
        System.out.println(res);
        System.out.println(ans);

    }

  static int findIndex(int[] nums, int target, int index) {
        if(index==nums.length)
        {
            return -1;
        }
        if(nums[index]==target)
        {
            return index;
        }
        else
        {
            return findIndex(nums,target,index+1);
        }
    }

    static boolean searchEle(int[] nums, int target,int index) {
      if (index==nums.length)
      {
          return false;
      }
        return (nums[index]==target)||searchEle(nums,target,index+1);
    }

}
