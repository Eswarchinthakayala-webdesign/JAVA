package com.Sriram;

public class Permutations {
    public static void main(String[] args) {
        String up="abc";
        permute(up,"");

    }
    static void permute(String up,String p)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        int n=p.length();
        for (int i = 0; i <=n; i++) {
            permute(up.substring(1),p.substring(0,i)+ch+p.substring(i,n));
        }
    }
}
