package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Practise {
    public static void main(String[] args) {
        String up="abc";
        ArrayList<String> ans=subsetsPracII(up,"");
        System.out.println(ans);


     }

  static ArrayList<String> subsetsPracII(String up, String p) {
        if(up.isEmpty())
        {
            ArrayList<String> res=new ArrayList<>();
            res.add(p);
            return res;
        }

        char ch=up.charAt(0);
        ArrayList<String> left=subsetsPracII(up.substring(1),p+ch);
        ArrayList<String> right=subsetsPracII(up.substring(1),p);
        left.addAll(right);
        return left;
    }
