import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
        int [] nums={2,3,4,5,7,9,10,11,21,23,24,25,30};
        int target=24;
        int result=ans(nums,target);
        System.out.println(result);

    }

 static int ans(int[] nums, int target) {
        int start=0;
        int end=1;
        while(target>nums[end])
        {
            int temp=end+1;
            end=end+(end-start+1)*2;
            if(end>=nums.length)
            {
                end=nums.length-1;
            }
            start=temp;

        }
return searRange(nums,target,start,end);
    }

    static int searRange(int[] nums, int target,int start,int end) {
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

}
