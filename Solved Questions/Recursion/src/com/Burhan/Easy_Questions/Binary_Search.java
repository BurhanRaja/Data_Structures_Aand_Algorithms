package com.Burhan.Easy_Questions;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 10, 13, 16, 20, 25, 39, 56};
        int target = 39;
        int start = 0;
        int end = arr.length-1;
        int ans = binarySearch(arr, target, start, end);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end-start)/2;
        if (target > arr[mid]) {
            return binarySearch(arr, target, mid+1, end);
        }
        else if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid-1);
        }
        else {
            return mid;
        }
    }
}
