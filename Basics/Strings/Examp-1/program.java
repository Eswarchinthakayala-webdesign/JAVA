package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
           int [] nums={1,2,3,4,5};
           int [] arr=nums;
           String a="Eswar";
           String b=a;
           b="sriram";
           arr[0]=9;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(arr));
        System.out.println(a);
        System.out.println(b);
    }


}
