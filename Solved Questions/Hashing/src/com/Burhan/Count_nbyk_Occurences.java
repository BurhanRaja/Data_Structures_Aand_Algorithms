package com.Burhan;

import java.util.Arrays;
import java.util.HashMap;

public class Count_nbyk_Occurences {
    public static void main(String[] args) {
        int[] arr = {10,10,20,30,20,10,10};
        int k = 2;
        nbykOccurrence(arr, k);
        nbykOccurrence2(arr, k);
        nbykOccurrence3(arr, k);
    }

    // First possibility
    static void nbykOccurrence(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag=true;
                }
            }

            if (!flag) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
            }

            if (count > Math.abs(arr.length/k)) {
                System.out.println(arr[i]);
            }
        }
    }

    // Second Possibility
    static void nbykOccurrence2(int[] arr, int k) {
        Arrays.sort(arr);

        int count = 1;
        int i = 1;

        while(i<arr.length) {
            while (i < arr.length && arr[i] == arr[i-1]) {
                count++;
                i++;
            }
            if (count > Math.abs(arr.length/k)) {
                System.out.println(arr[i-1]);
            }
            count = 1;
            i++;
        }
    }

    // Efficient
    static void nbykOccurrence3(int[] arr, int k) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hMap.put(arr[i], hMap.getOrDefault(arr[i], 0)+1);
            
            if (hMap.get(arr[i]) > Math.abs(arr.length/k)) {
                System.out.println(arr[i]);
            }
        }
    }
}
