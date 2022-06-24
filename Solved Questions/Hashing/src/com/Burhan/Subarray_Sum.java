package com.Burhan;

import java.util.HashSet;

public class Subarray_Sum {
    public static void main(String[] args) {
        int[] arr = {5,8,6,13,3,-1};
        boolean ans = effSubArr(arr, 22);
        System.out.println(ans);
    }

    static boolean subArr(int[] arr, int sum) {
        for (int i=0; i < arr.length; i++) {
            int sum1 = 0;
            for (int j = i; j < arr.length; j++) {
                sum1 += arr[j];
                if (sum1 == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean effSubArr(int[] arr, int sum) {
        int sum1 = 0;
        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
            
            if (h.contains(sum1-sum)){
                return true;
            }
            if (sum1 == sum) {
                return true;
            }
            h.add(sum1);
        }

        return false;
    } 
}
