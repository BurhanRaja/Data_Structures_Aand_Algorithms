package com.Burhan;

public class Find_num_Mountain_Array {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 4, 5, 3, 1};
        int[] arr = {1, 2, 3, 6, 8, 10, 5, 4};
        int target = 4;

        int answer = ans(arr, target);
        System.out.println(answer);
    }

    // Getting the answer by combining the below three functions
    static int ans(int[] arr, int target) {
        int peak = peakNum(arr);
        int firstHalf = binarySearch(arr, target, 0, peak);

        if (firstHalf != -1) {
            return firstHalf;
        }
        else {
            return reverseBinarySearch(arr, target, peak+1, arr.length-1);
        }
    }

    // Finding Peak in Mountain Array
    static int peakNum(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid+1] > arr[mid]) {
                start = mid+1;
            }
            else if(arr[mid-1] > arr[mid]) {
                end = mid-1;
            }
            else {
                return mid;
            }
        } 
        return -1;
    }

    // Ascending Binary Search
    static int binarySearch(int[] arr, int target, int start, int end) {;

        while (start <= end) { 
            int mid = start + (end - start)/2;

            if (arr[mid] > target) {
                end = mid-1;
            }
            else if (arr[mid] < target) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    // Descending binary search
    static int reverseBinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) { 
            int mid = start + (end - start)/2;

            if (arr[mid] < target) {
                end = mid-1;
            }
            else if (arr[mid] > target) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
