package com.Burhan;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {-18, -9, -2, 0, 2, 4, 9, 16, 22, 34, 89};
        //             0,  1,  2, 3, 4, 5, 6,  7, 8,  9,  10 

        System.out.println(binarySearch(arr, 9));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
