package com.Burhan;

import java.util.Arrays;

public class Heap_Sort {
    public static void main(String[] args) {
            
        int[] arr = {10, 15, 50, 4, 20};
        heapSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // Step-3
    // Time Complexity :- O(nlogn)
    static void heapSort(int[] arr, int n) {
        buildHeap(arr, n);
        for (int j = n-1; j >= 1; j--) {
            swap(arr, 0, j);
            maxHeapify(arr, j, 0);
        }
    }

    // Step-2
    static void buildHeap(int[] arr, int n) {
        for (int j = (n-2)/2; j >= 0 ; j--) {
            maxHeapify(arr, n, j);
        }
    }

    // Step-1
    static int[] maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if ((left < n) && arr[largest] < arr[left]) {
            largest = left;
        }
        if ((right < n) && arr[largest] < arr[right]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, largest, i);
            maxHeapify(arr, n, largest);
        }
        return arr;
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
