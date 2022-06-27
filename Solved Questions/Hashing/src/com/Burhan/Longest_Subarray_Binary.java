package com.Burhan;

import java.util.HashMap;

public class Longest_Subarray_Binary {
    public static void main(String[] args) {
        // int[] arr = {0,0,1,1,1,1,1,0};
        // int[] arr = {1,0,1,1,1,0,0}; // Not able to get corret answer for this only
        // int[] arr = {1,0,1,1,1,0,0,1};
        // int[] arr = {1,1,1,1,1};
        int[] arr = {0,0,0,0};
        // longestSubarray(arr);
        longestSubarray2(arr);
    }

    static void longestSubarray(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int count0 = 0;
            int count1 = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    count0++;
                }
                else {
                    count1++;
                }
                if (count0 == count1) {
                    res = Math.max(res, count0+count1);
                }
            }
        }
        System.out.println(res);
    }

    static void longestSubarray2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }

        HashMap<Integer, Integer> h = new HashMap<>();
        int sum = 0;
        int res = 0; 
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                res = i+1;
            }
            if (!h.containsKey(sum)) {
                h.put(sum, i);
            }
            if (h.containsKey(0)){
                res = Math.max(res, i-h.get(0));
            }
        }

        System.out.println(res);
    }
}
