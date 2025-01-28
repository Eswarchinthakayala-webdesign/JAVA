package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Practise {
    public static void main(String[] args) {
        int[]nums={1,2,3};
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=getSubsets(nums,0,res);
        System.out.println(ans);
     }

    static ArrayList<ArrayList<Integer>> getSubsets(int[] nums,int i, ArrayList<Integer> res) {

        if (i == nums.length) {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(res));
            return ans;
        }
        res.add(nums[i]);
        ArrayList<ArrayList<Integer>> left = getSubsets(nums, i + 1, res);
        res.remove(res.size() - 1);
        ArrayList<ArrayList<Integer>> right = getSubsets(nums, i + 1, res);
        left.addAll(right);
        return left;
    }
