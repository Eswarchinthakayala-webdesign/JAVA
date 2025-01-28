package com.Sriram;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String up="abc";
        int ans=countPermute(up,"");
        System.out.println(ans);

    }

    static int countPermute(String up,String p)
    {
        if(up.isEmpty())
        {
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        int n=p.length();
        for (int i = 0; i <=n; i++) {
            count=count+countPermute(up.substring(1),p.substring(0,i)+ch+p.substring(i,n));

        }
        return count;
    }
    static ArrayList<String> permute(String up, String p) {
        ArrayList<String> sol=new ArrayList<>();
        if(up.isEmpty())
        {
           ArrayList<String> res=new ArrayList<>();
           res.add(p);
           return res;
        }
        char ch=up.charAt(0);
        int n=p.length();
        for (int i = 0; i <=n; i++) {

            ArrayList<String> list=permute(up.substring(1),p.substring(0,i)+ch+p.substring(i,n));
            sol.addAll(list);
        }
        return  sol;
    }
}
