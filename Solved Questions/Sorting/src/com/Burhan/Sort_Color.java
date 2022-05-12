package com.Burhan;

import java.util.*;

public class Sort_Color {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }

    static void sortColors(int[] nums) {
        
        int i = 0;
        while (i < nums.length) {
            int index = nums[i]-1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[index]) {
                swap(nums, index, i);
            }
            else {
                i++;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
    
    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
