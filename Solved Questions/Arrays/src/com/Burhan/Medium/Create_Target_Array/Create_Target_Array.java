package com.Burhan.Medium.Create_Target_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Create_Target_Array {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] ans = targetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }

    // nums = [0,1,2,3,4], index = [0,1,2,2,1]
    static int[] targetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        ArrayList<Integer> list = new ArrayList<>();


        for (int i =0; i<n; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < n; i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
