package com.Burhan;

public class Max_Sum_Subarray {
    public static void main(String[] args) {
        // int[] array = {2, 3, -8, 7, -1, 2, 3};
        // int[] array = {5, 8, 3};
        // int[] array = {-5, -8, -3};
        // int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int[] array = {1};
        // int ans = maxSum(array);
        int ans = maxSumSubarr(array);
        System.out.println(ans);
    }

    static int maxSum(int[] arr) {
        int n = arr.length;
        int res = arr[0];

        for (int i=0; i<n; i++) {
            int current = 0;
            for (int j = i; j < n; j++) {
                current += arr[j];
                res = Math.max(current, res);
            }
        }

        return res;
    }

    // Efficient (Kadan's Algorithm)
    static int maxSumSubarr(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = nums[0];
        
        for (int i=0; i<n; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
