package com.Burhan;

public class Search_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        int ans = numRotated(arr, target);
        System.out.println(ans);
    }

    static int numRotated(int[] arr, int target) {
        int pivot = peakNum(arr);

        int firstHalf = binarySearch(arr, target, 0, pivot);

        if (firstHalf != -1) {
            return firstHalf;
        }
        else {
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }
    }


    // {3, 4, 5, 6, 7, 0, 1, 2}
    static int peakNum(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[start] < arr[mid]) {
                start = mid;
            }
            else if(arr[start] > arr[mid]) {
                start = mid-1;
            }
            else {
                start = start+1;
            }
        } 
        return start;
    }

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
}
