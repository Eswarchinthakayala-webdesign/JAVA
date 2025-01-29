package com.Eswar;
import java.util.*;

public class LeetCode {

    public static void main(String[] args) {


        ArrayList<String> ans=phoneNumII("","12");
        System.out.println(ans);

    }

   static ArrayList<String> phoneNumII(String p, String up) {
       ArrayList<String> ans=new ArrayList<>();
        if(up.isEmpty())
        {
            ArrayList<String> res=new ArrayList<>();
            res.add(p);
            return res;
        }
        int digit=up.charAt(0)-'0';
       for (int i = (digit-1)*3; i < digit*3; i++) {
           ArrayList<String> pt=phoneNumII(p+(char)(i+'a'),up.substring(1));
           ans.addAll(pt);
       }
       return ans;
    }
