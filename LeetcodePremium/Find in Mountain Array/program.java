import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,3,1};
        int target=3;
        int result=searchIndex(nums,target);
        System.out.println(result);

    }
 static int searchIndex(int[] nums, int target) {
        int peak=peakIndex(nums);
        int leftSide=binarySearch1(nums,target,0,peak);
        int rightSide=binarySearch2(nums,target,peak+1,nums.length-1);
        if(leftSide!=-1)
        {
            return leftSide;
        }
        else
        {
            return rightSide;
        }


    }

 static int binarySearch2(int[] nums, int target, int start, int end) {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            if(target<nums[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;

    }

    static int binarySearch1(int[] nums, int target, int start, int end) {
     while(start<=end)
     {

         int mid=start+(end-start)/2;
         if(target==nums[mid])
         {
             return mid;
         }
         if(target<nums[mid])
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

    static int peakIndex(int [] nums)
    {
        int start=0;
        int end=nums.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }

}
