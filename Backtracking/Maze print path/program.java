package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Practise {
    public static void main(String[] args) {

       List<String> ans=getMazeRev("",2,2);
        System.out.println(ans);

     }

     static List<String> getMazeRev(String p, int r, int c) {
        List<String> ans=new ArrayList<>();
        if(r==0 && c==0)
        {
            ans.add(p);
            return ans;
        }

        if(c>0) {
            List<String> left = getMazeRev(p + "L", r, c - 1);
            ans.addAll(left);
        }
        if(r>0) {
            List<String> right = getMazeRev(p + "U", r - 1, c);
            ans.addAll(right);
        }
        return ans;

    }
