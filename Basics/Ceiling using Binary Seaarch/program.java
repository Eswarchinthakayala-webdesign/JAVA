import java.util.*;



public class LeetCode{

public static void main(String[] args) {
 int [] arr={2,3,4,5,6,7,8,14,16,18};
 int target=19;
 int result=peakElement(arr,target);
    System.out.println(arr[result]);
    }

  static int peakElement(int[] arr,int target) {
    int start=0;
    int end=arr.length-1;
    while(start<=end)

    {
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(arr[mid]<target)
        {
            start=mid+1;
        }
        else
        {
            end=mid-1;
        }
    }
    return start;

    }
}
