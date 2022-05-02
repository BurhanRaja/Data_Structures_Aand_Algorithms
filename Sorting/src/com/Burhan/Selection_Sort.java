package com.Burhan;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 1, 3};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxNum = maxNumber(arr, 0, last);
            swap(arr, maxNum, last);
        }
    }

    static int maxNumber(int[] arr, int start, int end) {
        int maxNum = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxNum]) {
                maxNum = i;
            }
        }
        return maxNum;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
