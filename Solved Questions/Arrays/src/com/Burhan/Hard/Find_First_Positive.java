package com.Burhan.Hard;

import java.util.Arrays;

public class Find_First_Positive {
    public static void main(String[] args) {
        // int[] nums = {1,2,0};
        // int[] nums = {3,4,-1,1};
        // int[] nums = {7,8,9,11,12};
        int[] nums = {-3, -2, -1, 0, 1, 2, 4};
        int ans = firstPositive(nums);
        System.out.println(ans);
    }

    static int firstPositive(int[] nums) {
        Arrays.sort(nums);
        
        if (nums.length==1) {
            return nums[0]+1;
        }

        int count = nums[1];

        for (int i = 1; i < nums.length; i++) {
            if (count != nums[i]) {
                return count;
            }
            else {
                count++;
            }
        }
        return count;
    }
}
