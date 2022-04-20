package com.Burhan;

import java.util.Arrays;

public class Continuous_Sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(OneDArray(arr)));
    }

    static int[] OneDArray(int[] nums){
        int n = nums.length;
        int i = 0;
        int sum = 0;
        int[] temp = new int[n];
        while (i < n) {
            sum += nums[i];
            temp[i] = sum;
            i++;
        }
        return temp;
    }
}
