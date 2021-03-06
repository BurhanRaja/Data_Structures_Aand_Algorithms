package com.Burhan;

import java.util.Arrays;

class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        // To check if the elements are swapped or not
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
                // Can also be used
                // else {
                //     break;
                // }
            }
            // To break if the array is already sorted (not true then break)
            if (!flag) {
                break;
            }
        }
    }
}