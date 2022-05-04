package com.Burhan;

import java.util.*;

public class Set_Mismatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        int[] ans = setMismatch(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] setMismatch(int[] arr) {
        int i = 0;
        int[] list = new int[2];
        while (i < arr.length) {
            int index = arr[i]-1;
            if (arr[i] != arr[index]) {
                swap(arr, index, i);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                list[0] = arr[j];
                list[1] = j+1;
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
