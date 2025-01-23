package com.Eswar;

import java.util.ArrayList;

public class Recursion {

    public static void main(String[] args) {
         int [] nums={1,2,3,4,5,6,7,7,8};
        ArrayList<Integer> ans=new ArrayList<>();
        int target=7;
        ArrayList<Integer> res=getIndices(nums,target,ans,0);
        System.out.println(res);
    }

 static ArrayList<Integer> getIndices(int[] nums, int target, ArrayList<Integer> ans, int index) {
        if(index==nums.length)
        {
            return ans;
        }
        if(nums[index]==target)
        {
            ans.add(index);

        }
        return getIndices(nums,target,ans,index+1);

    }

}
