package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Practise {
    public static void main(String[] args) {
        int[]nums={1,2,3};

        ArrayList<ArrayList<Integer>> ans=getSubsetsII(nums);
        System.out.println(ans);
     }

   static ArrayList<ArrayList<Integer>> getSubsetsII(int[] nums) {

        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:nums)
        {

            int n=outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
