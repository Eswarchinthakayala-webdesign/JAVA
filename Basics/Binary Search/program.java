import java.util.*;
public class LeetCode{

public static void main(String[] args) {
    int [] nums={18,12,11,10,8,7,6,4,3};
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
        if(target>nums[mid])
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
