package com.Burhan;

import java.util.HashSet;

public class Pair_in_Array_sum {
    public static void main(String[] args) {
        int[] arr = {3,2,8,15,8,-8};
        boolean ans = effSumPair(arr, 10);
        System.out.println(ans);
        
    }

    static boolean sumPair(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean effSumPair(int[] arr, int sum) {
        HashSet<Integer> h = new HashSet<>();

        for (int x: arr) {
            if (h.contains(sum-x)) {
                return true;
            }
            else {
                h.add(x);
            }
        }

        return false;
    }
}
