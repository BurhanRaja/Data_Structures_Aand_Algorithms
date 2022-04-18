package com.Burhan;

import java.util.Arrays;

public class Left_Rotate {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        // left_rot_one(array);
        // D_rotate(array, 2);
        D_rotateTwo(array, 3);
        // D_rotateThree(array, 2);
        System.out.println(Arrays.toString(array));

    }

    // One element rotation
    static void left_rot_one(int[] arr) {
        int n = arr.length;
        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    // // Naive Method
    // // Rotate from specified element
    // // Index starts from 0 and position starts from 1.
    static void D_rotate(int[] arr, int d) {

        for (int i = 0; i < d; i++) {
            left_rot_one(arr);
        }
    }

    // // Better
    // { 1, 2, 3, 4, 5 }
    static void D_rotateTwo(int[] arr, int d) {

        int n = arr.length;
        int[] temp = new int[d];
        // Storing d elements in temperoray array from actual array
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        // Bringing the elements after dth element in an array by d
        for (int j = d; j < n; j++) {
            arr[j - d] = arr[j];
        }
        // Assigning the last space to the first elements.
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    // Efficient method
    static void D_rotateThree(int[] arr, int d) {
        int n = arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] num, int start, int end) {
        while (start < end) {
            swap(num, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] num, int a, int b) {
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
}