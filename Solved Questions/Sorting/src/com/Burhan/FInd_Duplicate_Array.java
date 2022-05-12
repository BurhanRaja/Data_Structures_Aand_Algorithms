package com.Burhan;

import java.util.*;

public class FInd_Duplicate_Array {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        // int[] arr = {1,1, 2};
        // int[] arr = {1};
        List<Integer> ans = findDup(arr);
        System.out.println(ans);
    }

    static List<Integer> findDup(int[] arr) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while (i < arr.length) {
            int index = arr[i]-1;
            if (arr[i] != arr[index]) {
                swap(arr, index, i);
            }
            else {
                i++;
            }
        }
        for (int j = 1; j <= arr.length; j++) {
            if (arr[j-1] != j) {
                list.add(arr[j-1]);
            }
        }
        return list;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
