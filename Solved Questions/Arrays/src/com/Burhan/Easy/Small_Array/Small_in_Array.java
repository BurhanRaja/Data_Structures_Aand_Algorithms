package com.Burhan.Easy.Small_Array;

import java.util.Arrays;

public class Small_in_Array {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] ans = smallerArray(arr); 
        System.out.println(Arrays.toString(ans));
    }
    static int[] smallerArray(int[] nums) {
        int n = nums.length;
        int[] Nsmall = new int[n];
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            Nsmall[i] = count;
        }
        return Nsmall;
    }
}
