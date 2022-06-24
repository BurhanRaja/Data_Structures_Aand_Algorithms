package com.Burhan;

import java.util.HashMap;

public class Longest_Subarray {
    public static void main(String[] args) {
        int[] arr = {5,2,3,4};
        int sum1 = 5;
        int ans = effLongSub(arr, sum1);
        System.out.println(ans);
    }

    static int longSub(int[] arr, int sum1) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == sum1) {
                    count = Math.max(count, j-i+1);
                }
            }
        }

        return count;
    }

    static int effLongSub(int[] arr, int sum1) {
        int sum = 0;
        int res = 0; 
        HashMap<Integer, Integer> hMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == sum1) {
                res=i+1;
            }
            if (!hMap.containsKey(sum)) {
                hMap.put(sum, i);
            }
            if (hMap.containsKey(sum-sum1)) {
                res = Math.max(res, i-hMap.get(sum-sum1));
            }
        }
        return res;
    }
}
