package com.Eswar;
import java.util.*;

public class LeetCode {

    public static void main(String[] args) {

       int a=25;
       int b=30;
       int ans=getFactorsCount(a,b);
        System.out.println(ans);
    }

   static int getFactorsCount(int a, int b) {
        ArrayList<Integer> factors=new ArrayList<>();
       for (int i = 1; i <=Math.sqrt(a) ; i++) {
           if(a%i==0)
           {
               if(a/i==i)
               {
                   factors.add(i);
               }
               else
               {
                   factors.add(i);
                   factors.add(a/i);
               }
           }

       }
      int count=0;
       for (int j = 1; j <=Math.sqrt(b); j++) {
           if(b%j==0)
           {
               if(b/j==j) {
                   if (factors.contains(j)) {
                       count++;
                   }
               }
               else
               {
                   if(factors.contains(j))
                   {
                       count++;
                   }
                   if(factors.contains(b/j))
                   {
                       count++;
                   }
               }
           }

       }
       return count;
    }
}
