package com.Burhan;

import java.util.Arrays;

public class Relative_Sort_array {
    public static void main(String[] args) {
        int[] arr1 = {33,22,48,4,39,36,41,47,15,45};
        int[] arr2 = {22,33,48,4};
        // int[] arr1 = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
        // int[] arr2 = {2,42,38,0,43,21};
        // int[] arr1 = {28,6,22,8,44,17};
        // int[] arr2 = {22,28,8,6};
        // int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        // int[] arr2 = {2,1,4,3,9,6};

        relativeSort(arr1, arr2);
    }

    // [2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31]
    // [2,42,38,0,43,21]

    // My Answer
    // [2,42,38,0,5,7,12,12,43,21,13,23,24,24,27,29,30,31,33,48]

    // Should come
    // [2,42,38,0,43,21,5,7,12,12,13,23,24,24,27,29,30,31,33,48]

    static void relativeSort(int[] arr1, int[] arr2) {
        int count = 0;
        Arrays.sort(arr1);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = count; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    swap(arr1, count, j);
                    count++;
                }
            }
        }
        System.out.println(count);

        for (int i = count; i < arr1.length-1; i++) {
            for (int j = i+1; j > count; j--) {
                if (arr1[j] < arr1[j-1]) {
                    swap(arr1, j, j-1);
                }
                else {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr1));
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int maxNumber(int[] arr, int start, int end) {
        int maxNum = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxNum]) {
                maxNum = i;
            }
        }
        return maxNum;
    }
}
