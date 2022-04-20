package com.Burhan;

public class Maximum_Difference {
    public static void main(String[] args) {
        // Maximum Difference where arr[j] - arr[i] such that j > i
        // int[] nums = {2, 3, 10, 6, 4, 8, 1};
        int[] nums = {7, 9, 5, 6, 3, 2};

        // if nums is a sorted array then it will always be the difference between the last and the second last elements.
        // if nums is a sorted array but from greater side it will be in negative.

        System.out.print(max_diffTwo(nums));
    }

    // Naive
    static int max_diff(int[] arr) {
        int n = arr.length;
        int sub = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = sub;
                sub = arr[j] - arr[i];
                if (temp >= sub) {
                    return temp;
                }
            }
        }
        return -1;
    }

    // Efficient
    static int max_diffTwo(int[] arr) {
        int n = arr.length;
        int res = arr[1] - arr[0];
        int minVal = arr[0];

        for (int j = 0; j < n; j++) {
            minVal = Math.min(minVal, arr[j]);
            res = Math.max(res, (arr[j] - minVal));
        }
        return res;
    }
}
