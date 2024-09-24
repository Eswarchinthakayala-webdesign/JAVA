import java.util.*;



public class LeetCode{

public static void main(String[] args) {
 int [] nums={48,32,23,20,11,8,9,10};
 int target=8;
 int result=searching(nums,target);
    System.out.println(result);
  }

  static int searching(int[] nums, int target) {
    int start=0;
    int end=nums.length-1;
    int result;
    if(nums[start]>nums[end])
    {
        result=decreasing(nums,target,start,end);
    }
    else
    {
        result=increasing(nums,target,start,end);
    }
    return result;
    }

  static int increasing(int[] nums, int target, int start, int end) {
      while(start<=end)
      {
          int mid=start+(end-start)/2;
          if(nums[mid]==target)
          {
              return mid;
          }
          if(nums[mid]>target)
          {
              end=mid-1;
          }
          else
          {
              start=mid+1;
          }
      }
      return -1;
    }

    static int decreasing(int[] nums, int target, int start, int end) {
    while(start<=end)
    {
        int mid=start+(end-start)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        if(nums[mid]<target)
        {
            end=mid-1;
        }
        else
        {
            start=mid+1;
        }
    }
    return -1;
    }
}
