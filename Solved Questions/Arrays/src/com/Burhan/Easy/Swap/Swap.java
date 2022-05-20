package com.Burhan.Easy.Swap;

import java.util.Arrays;

class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        
        // swap(array, start-index, end-index)
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}