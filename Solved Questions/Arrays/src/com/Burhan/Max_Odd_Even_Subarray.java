package com.Burhan;

public class Max_Odd_Even_Subarray {
    public static void main(String[] args) {
        int[] arr = {10, 12, 14, 7, 8};
        // int ans = maxEOSubarray(arr);
        int ans = maxEOSubarrayTwo(arr);
        System.out.println(ans);
    }

    static int maxEOSubarray(int[] arr) {
        int n = arr.length;
        int res = 1;
        for (int i = 0; i < n; i++) {
            int count = 1; // Because the number itself is also counts
            for (int j = i+1; j < n; j++) {
                if (arr[j-1] % 2 == 0 && arr[j] % 2 != 0 || arr[j-1] % 2 != 0 && arr[j] % 2 == 0) {
                    count++;
                }
                else {
                    break;
                }
            }
            res = Math.max(count, res);
        }
        return res;
    }

    // Efficient
    static int maxEOSubarrayTwo(int[] arr) {
        int n = arr.length;
        int res = 1;
        int count = 1;

        for (int i = 1; i<n; i++) {
            if (arr[i-1] % 2 == 0 && arr[i] % 2 != 0 || arr[i-1] % 2 != 0 && arr[i] % 2 == 0) {
                count++;
                res = Math.max(res, count);
            }
            else {
                count = 1;
            }
        }
        return res;
    }
}
