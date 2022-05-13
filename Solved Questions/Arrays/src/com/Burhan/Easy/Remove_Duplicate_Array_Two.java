package com.Burhan.Easy;

import java.util.Arrays;

public class Remove_Duplicate_Array_Two {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        // int[] arr = {1,2,2};
        int[] ans = duplicate(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] duplicate(int[] nums) {
        int n = nums.length;
        int res = 2; // 

        // {1, 1, {{1, 2}}, 2, 3}
        // {1, 1, 2, {{2, 2}}, 3} // res = 3
        // {1, 1, 2, 2, {{2, 3}}} // res = 4
        // {1, 1, 2, 2, 3, 0} // res = 5

        // Here, we can skip 2 places before because the we have to store 2 equal value elements. So, if first 2 values are not considered it does not matter. It will eventually skip the condition
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[res-1] || nums[i] != nums[res-2]) {
                nums[res] = nums[i];
                res++;
            }
        }
        return nums;
    }
}

// Here, the condition will run three times 0, 1, 2
// On 3 the condition will come into action and make nums[2] = nums[3] because res = 2 and i = 3
// then res wil be updated to res = 3, the action will run run because nums[4] == nums[2] && nums[4] != nums[1]      becoz int first nums[res] = 2 i.e. res = 2
// Now at 5 the condition will get run again because the 
