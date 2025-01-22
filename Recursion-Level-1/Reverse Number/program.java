package com.Eswar;

public class Recursion {

    public static void main(String[] args) {
      int ans=getReverse(1234);
        System.out.println(ans);
    }

 static int getReverse(int n) {
        int ans=reverseHelper(n,0);
     return ans;
    }

    private static int reverseHelper(int n, int sum) {
        if(n==0)
        {
            return sum;
        }
        int rem=n%10;
        sum=sum*10+rem;

       return reverseHelper(n/10,sum);
    }
}
