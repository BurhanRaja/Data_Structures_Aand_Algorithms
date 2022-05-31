package com.Burhan.Sorting_Questions;

import java.util.*;

public class Selection_Sort {
    public static void main(String[] args) {
        // int[] arr = {3,1,4,5,8,2};
        int[] arr = {90,12,456,23,5,7,256,13};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int r, int c, int max) {
        if (r==0) {
            return;
        }

        if (c<r) {
            if (arr[c] > arr[max]) {
                selectionSort(arr, r, c+1, c);
            }
            else {
                selectionSort(arr, r, c+1, max);
            }
        }

        else {
            swap(arr, max, r-1);
            selectionSort(arr, r-1, 0, 0);
        }
    }

    // Doing selection sort
    // static void selectionSort(int[] arr, int n) {
    //     if (n == 0) {
    //         return;
    //     }
    //     int maxNum =  maxNumber(arr, n);
    //     swap(arr, maxNum, n);
    //     selectionSort(arr, n-1);
    // }

    // Swapping in bubble sort
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // // Maximum Number index
    // static int maxNumber(int[] arr, int n) {
    //     int num = 0;
    //     for (int i = 0; i <= n; i++) {
    //         if (arr[num] < arr[i]) {
    //             num = i;
    //         }
    //     }
    //     return num;
    // }

}
