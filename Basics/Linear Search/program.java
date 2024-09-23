package com.Eswar;

public class Searching {
    public static void main(String[] args) {
    int [] arr={4,5,6,7,3,4,2,3};
    int target=3;
    int result=linearSearch(arr,target);
    if(result==-1)
    {
        System.out.println("Element Not Found.");
    }
    else
    {
        System.out.println("Element found at: "+result);
    }

    }
    static int linearSearch(int[] arr,int target)
    {
       if(arr.length==0)
       {
           return -1;
       }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
                return i;
            }

        }
        return -1;
    }
}
