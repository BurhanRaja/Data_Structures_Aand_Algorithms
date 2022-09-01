package com.Burhan;

import java.util.Arrays;
import java.util.HashSet;

public class Count_Distinct_Element {
    public static void main(String[] args) {
        // int[] arr = {15, 12, 13, 12, 13, 18};
        Integer[] arr = {15, 12, 13, 12, 13, 18};
        // int ans = countEl2(arr);
        Integer ans = countEl3(arr);
        System.out.println(ans);
    }

    // Naive - O(n^2)
    static int countEl(int[] arr) {
        int res = 0;
        
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i-1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                res++;
            }
        }
        return res;
    }

    // Efficient - O(n)
    static int countEl2(int[] arr) {
        HashSet<Integer> hSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hSet.add(arr[i]);
        }
        return hSet.size();
    }

    // Efficient - O(n)
    static int countEl3(Integer[] arr) {
        HashSet<Integer> hSet = new HashSet<>(Arrays.asList(arr));
        return hSet.size();
    }
}