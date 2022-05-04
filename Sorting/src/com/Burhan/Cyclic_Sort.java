package com.Burhan;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5, 2};
        cyclic_sort(arr);
    }

    // Only works for 1 to N.

    static void cyclic_sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int index = arr[i]-1;
            if (arr[i] == arr[index]) {
                swap(arr, index, 0);
            }
            else {
                i++;
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    } 
}
