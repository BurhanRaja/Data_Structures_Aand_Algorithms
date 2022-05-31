package com.Burhan.Sorting_Questions;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,2};
        // bubbleSortCall(arr);
        // System.out.println(Arrays.toString(arr));
        bubbleSort2(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    // To Call the bubble sort for required amount of time. 
    static void bubbleSortCall(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            bubbleSort(arr, 0);
        }
    }

    // Doing bubble sort
    static void bubbleSort(int[] arr, int n) {
        if (n == arr.length-1) {
            return;
        }
        if (arr[n] > arr[n+1]) {
            swap(arr, n, n+1);
            bubbleSort(arr, n+1);
        }
        else {
            bubbleSort(arr, n+1);
        }
    }

    // Or You can also do something like
    static void bubbleSort2(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            if (arr[col] > arr[col+1]) {
                swap(arr, col, col+1);
            }
            bubbleSort2(arr, row, col+1);
        }
        else {
            bubbleSort2(arr, row-1, 0);
        }
    }

    // Swapping in bubble sort
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
