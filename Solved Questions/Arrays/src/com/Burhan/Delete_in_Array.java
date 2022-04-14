package com.Burhan;

import java.util.Arrays;

public class Delete_in_Array {
    public static void main(String[] args) {

        // In fixed array
        int[] arr = {3, 8, 12, 5, 6};

        delete(arr, 12);
        System.out.println(Arrays.toString(arr));
    }

    static void delete(int[] arr, int x) {
        // This for loop will break at when the value at index i is qual to the x
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        // then the i will be compared to length of an array
        // If i reaches the length of an array and could not find the x in an array
        if (i == arr.length) {
            System.out.println(arr.length);
        }

        // This for loop from i to the last index is to shift the position backwards one-one
        int j;
        for (j = i; j < arr.length-1; j++) {
            arr[j] = arr[j+1];
        }
        arr[j] = 0;
    }
}
