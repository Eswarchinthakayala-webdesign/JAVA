package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Practise {
    public static void main(String[] args) {
        int[]nums={1,2,2};
        ArrayList<ArrayList<Integer>> ans=getSubsetsIII(nums);
        System.out.println(ans);
     }

     static ArrayList<ArrayList<Integer>> getSubsetsIII(int[] nums) {
         int start = 0;
         int end = 0;
         Arrays.sort(nums);
         ArrayList<ArrayList<Integer>>  outer=new ArrayList<>();
         outer.add(new ArrayList<>());
         for(int i=0;i<nums.length;i++)
         {
             start=0;
             if(i>0 && nums[i]==nums[i-1])
             {
              start=end+1;
             }
             end=outer.size()-1;
             int n=outer.size();
             for(int j=start;j<n;j++)
             {
                 ArrayList<Integer> internal=new ArrayList<>(outer.get(j));
                 internal.add(nums[i]);
                 outer.add(internal);
             }
         }
         return outer;
     }
