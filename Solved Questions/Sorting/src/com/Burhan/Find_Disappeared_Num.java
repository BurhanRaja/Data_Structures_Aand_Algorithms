package com.Burhan;

import java.util.*;

public class Find_Disappeared_Num {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        // int[] arr = {1,1};
        List<Integer> ans = findNum(arr);
        System.out.println(ans);
    }

    // The duplicate numbers will swap by itself only
    
    static List<Integer> findNum(int[] arr) {
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
                list.add(j);
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
