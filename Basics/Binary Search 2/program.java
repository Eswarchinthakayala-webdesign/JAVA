import java.util.*;
public class LeetCode{

public static void main(String[] args) {
    int [] nums={3,4,5,6,7,8,9,10,11,12};
    int target=10;
    int result=searching(nums,target);
    System.out.println(result);

    }

 static int searching(int[] nums,int target) {
    int left=0;
    int right=nums.length-1;
    while(left<=right)
    {
        int mid=left+(right-left)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        if(target<nums[mid])
        {
            right=mid-1;
        }
        else
        {
            left=mid+1;
        }

    }
    return -1;
  }
}
