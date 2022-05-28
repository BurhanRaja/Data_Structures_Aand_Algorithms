package com.Burhan.Array_Questions;

public class Rotated_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {9,1,2,3,4,5,6,7,8};
        System.out.println(RBS(arr, 5, 0, arr.length-1));
    }

    static int RBS(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end-start)/2;

        if (target == arr[mid]) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (arr[mid] > target && arr[start] <= target) {
                return RBS(arr, target, start, mid-1);
            }
            else {
                return RBS(arr, target, mid+1, end);
            }
        }

        if (arr[mid] < target && arr[end] >= target) {
            return RBS(arr, target, mid+1, end);
        }
        else {
            return RBS(arr, target, start, mid-1);
        }
    }
}
