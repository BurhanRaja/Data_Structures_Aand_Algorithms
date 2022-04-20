package com.Burhan;

import java.util.Arrays;

public class Delete_in_Array {
    public static void main(String[] args) {

        // In fixed array
        int[] arr = {3, 6, 12, 6, 5};

        // delete(arr, 6);
        // System.out.println(removeElement(arr, 6));
        removeElement(arr, 12);
        System.out.println(Arrays.toString(arr));
    }

    static int delete(int[] arr, int x) {
        int n = arr.length;
        // This for loop will break at when the value at index i is qual to the x
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        // then the i will be compared to length of an array
        // If i reaches the length of an array and could not find the x in an array
        if (i == n) {
            System.out.println(n);
        }

        // This for loop from i to the last index is to shift the position backwards one-one
        int j;
        for (j = i; j < n-1; j++) {
            arr[j] = arr[j+1];
        }
        return n-1;
    }

    // Short answer
    static int removeElement(int[] arr, int val) {
        int n = arr.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != val) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}
