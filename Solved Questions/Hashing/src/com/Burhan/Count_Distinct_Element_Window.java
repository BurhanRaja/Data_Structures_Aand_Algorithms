package com.Burhan;

import java.util.HashMap;

public class Count_Distinct_Element_Window {
    public static void main(String[] args) {
        int[] arr = {10,20,20,10,30,40,10};
        int k = 4;
        // slideWindow(arr, k);
        distinctCount(arr, k);
    }

    // Time Complexity O((n-k)*k*k)
    static void slideWindow(int[] arr, int k) {
        for (int i = 0; i < (arr.length-k+1); i++) {
            int count = 0; 
            for (int j = i; j <= k+i-1; j++) {
                boolean flag = false;
                for (int l = i; l < j; l++) {
                    if (arr[j]==arr[l]) {
                        flag=true;
                    }
                }
                if (!flag) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    static void distinctCount(int[] arr, int k) {
        HashMap<Integer, Integer> hMap = new HashMap<>();

        for (int i = 0; i < k; i++) {
            hMap.put(arr[i], hMap.getOrDefault(arr[i], 0)+1);
        }

        System.out.println(hMap.size());

        for (int i = k; i < arr.length; i++) {
            // Checking if the elemnt is not present in the hMap then add it.
            if (!hMap.containsKey(arr[i])) {
                hMap.put(arr[i], hMap.getOrDefault(arr[i], 0)+1);
            }
            
            // Reduce the value of previous key by 1
            hMap.replace(arr[i-k], hMap.get(arr[i-k]), hMap.get(arr[i-k])-1);
            
            // Check if the value is 0, if yes remove the key
            if (hMap.get(arr[i-k]) == 0) {
                hMap.remove(arr[i-k]);
            }

            System.out.println(hMap.size());
        }
    }
}
