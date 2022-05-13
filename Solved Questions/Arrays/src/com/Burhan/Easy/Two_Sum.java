package com.Burhan.Easy;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        // sumTwo(arr, target)
        System.out.print(Arrays.toString(sumTwo(arr, 9)));
    }

    static int[] sumTwo(int[] nums, int target) {
        int n = nums.length;
        int[] temp = new int[2];
        for (int i=0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    temp[0] = i;
                    temp[1] = j;
                    if (i>j) {
                        temp[1] = i;
                        temp[0] = j;
                    }
                }
            }
        }
        return temp;
    }
}
