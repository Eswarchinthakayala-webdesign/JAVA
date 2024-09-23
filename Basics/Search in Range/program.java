package com.Eswar;

public class Searching {
    public static void main(String[] args) {
        int [] arr={40,50,12,2,3,4,5};
        int target=2;
        int start=2;
        int end=5;
        int result=linearSearch(arr,target,start,end);
        System.out.println(result);

    }

  static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length==0)
        {
            return -1;
        }
      for (int i = start; i <= end; i++) {
            if(target==arr[i])
            {
                return i;
            }
      }
      return -1;
    }
}
