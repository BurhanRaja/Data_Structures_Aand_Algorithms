package com.Burhan;

import java.util.HashSet;

public class Subarray_Zero {
    public static void main(String[] args) {
        int[] arr = {1,4,13,-3,-10,5};
        String ans = effSubArr(arr);
        System.out.println(ans);
    }

    static String subArr(int[] arr) {
        
        if (arr.length == 1) {
            if (arr[0] == 0) {
                return "Yes";
            }
        }
        // {1,4,13,-3,-10,5}
        for (int i=0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    return "Yes";
                }
            }
        }
        
        return "No";
    }

    // Unique {
    static String effSubArr(int[] arr) {
        int sum = 0;
        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (h.contains(sum)) {
                return "Yes";
            }
            // If the sum==0 before any prefix sum or at the start
            if (sum == 0) {
                return "Yes";
            }
            h.add(sum);
        }

        return "No";
    }
    // }
}
