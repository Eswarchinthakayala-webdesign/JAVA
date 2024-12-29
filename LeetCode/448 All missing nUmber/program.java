package com.Eswar;

import java.util.ArrayList;
import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        ArrayList<Integer> result = findMissingElements(nums);
        System.out.println(result);
    }

    static ArrayList<Integer> findMissingElements(int[] nums) {
        int index = 0;
        ArrayList<Integer> missing = new ArrayList<>();

        // Cyclic sort to place elements in their correct positions
        while (index < nums.length) {
            if (nums[index]!= nums[nums[index] - 1]) { // Check if the value is in its correct position
                int temp = nums[nums[index] - 1];
                nums[nums[index] - 1] = nums[index];
                nums[index] = temp;
            } else {
                index++;
            }
        }

        // Find missing elements
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                missing.add(j + 1); // Add the missing number
            }
        }
        return missing;
    }
}
