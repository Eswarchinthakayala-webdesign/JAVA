package com.Eswar;

import java.util.Arrays;

public class BitWise {
    public static void main(String[] args) {
      //get fifth bit of 68
        int n=16;
        int i=5;
        int left=n&(1<<(i-1));
        int right=left>>(i-1);
        System.out.println(right);

    }

}
