package com.Burhan;

public class Maximum_Difference {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        // int[] arr = {7, 9, 5, 6, 3, 2};
        // int[] arr = {30, 10, 8, 2};
        // int ans = maxDiff(arr);
        int ans = maxDiff2(arr);
        System.out.println(ans);
    }   

    // Naive Solution - O(n^2)
    static int maxDiff(int[] arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                maxNum = Math.max(maxNum, arr[j]-arr[i]);
            }
        }
        return maxNum;
    }

    // Efficient Solution - O(n)
    static int maxDiff2(int[] arr) {
        int res = arr[1]-arr[0];
        int minVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res, arr[i] - minVal);
            minVal = Math.min(minVal, arr[i]);
        }

        return res;
    }

}
