package com.Burhan.Sorting_Questions;

import java.util.*;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,2};

        selectionSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            int maxNum =  maxNumber(arr, row);
            swap(arr, maxNum, row);
            selectionSort(arr, row, col+1);
        }
        else {
            selectionSort(arr, row-1, 0);
        }
    }

    // Swapping in bubble sort
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Maximum Number index
    static int maxNumber(int[] arr, int n) {
        int num = 0;
        for (int i = 0; i <= n; i++) {
            if (arr[num] < arr[i]) {
                num = i;
            }
        }
        return num;
    }

}
