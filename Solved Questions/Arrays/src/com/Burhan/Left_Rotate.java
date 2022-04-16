package com.Burhan;

import java.util.Arrays;

public class Left_Rotate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        // left_rot(array);
        D_rotate(array, 2);
        System.out.println(Arrays.toString(array));

    }

    static void left_rot(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
         
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    // Rotate from specified element
    // Index starts from 0 and position starts from 1.
    static void D_rotate(int[] arr, int index) {
        int n = arr.length;
        int temp = arr[index];

        for (int i = 0; i < n; i++) {
            arr[i-2] = arr[i];
        }
        arr[n-index] = temp;

    }
}
