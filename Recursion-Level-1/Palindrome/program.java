package com.Eswar;

public class Recursion {

    public static void main(String[] args) {
       int num=1221;
       boolean ans=palindrome(num);
        System.out.println(ans);
    }

    private static boolean palindrome(int num) {
        return num==getReverse(num);
    }

    static int getReverse(int num) {
        int digits=(int)(Math.log10(num)+1);
        return reverseHelper(num,digits-1);
    }

    static int reverseHelper(int num, int digits) {
        if(num%10==num)
        {
            return num;
        }
        return (num%10)*(int)Math.pow(10,digits)+reverseHelper(num/10,digits-1);
    }

}
