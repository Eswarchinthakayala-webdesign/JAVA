package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BitWise {
    public static void main(String[] args) {
      // power of two or not

      int n=6;
      int base=3;
      int ans=powersWithBase(n,base);
        System.out.println(ans);

    }

 static int powersWithBase(int n, int base) {
        int ans=1;
        while(n>0)
        {
            if((n&1)==1)
            {
                ans*=base;
            }

            base*=base;
        }
        return ans;
    }
}
