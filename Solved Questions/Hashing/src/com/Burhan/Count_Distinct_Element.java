package com.Burhan;

import java.util.*;

public class Count_Distinct_Element {
    public static void main(String[] args) {
        // int[] arr = {10,20,10,20,30};
        // int ans = countDigit(arr);
        // int ans = countEl(arr);
        // System.out.println(ans);
        
        Integer[] arr = {10,20,10,20,30};
        int ans = countElem(arr);
        System.out.println(ans);
    }


    // Naive Solution
    // Complexity = O(n^2)
    static int countDigit(int[] arr) {
        int res = 0;
    
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                }
            }
            if (flag==false) {
                res++;
            }
        }
    
        return res;
    }

    // Efficient Solution
    // Complexity = O(n)
    static int countEl(int[] arr) {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list.size();
    }

    // More Efficient Solution. If Integer array instead of int
    // Complexity = O(n)
    static int countElem(Integer[] arr) {
        HashSet<Integer> list = new HashSet<>(Arrays.asList(arr));
        return list.size();
    }
}

