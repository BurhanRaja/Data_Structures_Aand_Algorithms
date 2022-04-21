package com.Burhan;

public class Max_Sum_Subarray {
    public static void main(String[] args) {
        int[] array = {2, 3, -8, 7, -1, 2, 3};
        // int[] array = {5, 8, 3};
        // int[] array = {-5, -8, -3};
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

    // Efficient    
    static int maxSumSubarr(int[] arr) {
        int n = arr.length;
        int maxEndings = arr[0];
        int i;

        for (i = 1; i < n; i++) {
            maxEndings = Math.max(maxEndings + arr[i], arr[i]);
        }

        return maxEndings;
    }
}
