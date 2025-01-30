package com.Eswar;

public class Backtrack {
    public static void main(String[] args) {


        int ans=count(0,0);
        System.out.println(ans);
    }

    static int count(int r,int c)
    {
        if(r==2 || c==2)
        {
            return 1;
        }
        int left=count(r+1,c);
        int right=count(r,c+1);
        return left+right;
    }
}
