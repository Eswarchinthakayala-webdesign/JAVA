package com.Eswar;

public class Recursion {

    public static void main(String[] args) {
      int num=1200002030;
      int ans=getZerosCount(num);
        System.out.println(ans);
    }

    static int getZerosCount(int num) {
        return helper(num,0);
    }

    static int helper(int num, int count) {
        if(num==0)
        {
            return count;
        }
        if(num%10==0)
        {
            count+=1;
        }
        return helper(num/10,count);
    }

}
