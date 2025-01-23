package com.Eswar;

import java.util.ArrayList;

public class Recursion {

    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,4,5};
        int target=4;
        ArrayList<Integer> ans=new ArrayList<>();
        getIndices(nums,target,0,ans);
        System.out.println(ans);

    }
    static void getIndices(int[] nums,int target,int index,ArrayList<Integer> ans)
    {
        if(index==nums.length)
        {
            return;
        }
        if(nums[index]==target)
        {
            ans.add(index);
        }
        getIndices(nums,target,index+1,ans);
    }

}
