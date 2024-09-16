package com.Eswar;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
//        Create an Array
        int[] arr={1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

  static void change(int [] nums)
  {
      nums[0]=99;
  }

}
