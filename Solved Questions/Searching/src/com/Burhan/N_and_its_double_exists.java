package com.Burhan;

import java.util.Arrays;

public class N_and_its_double_exists {
    public static void main(String[] args) {
        // int[] arr = {10, 2, 5, 3};
        // int[] arr = {7,1,14,11};
        // int[] arr = {3,1,7,11};
        int[] arr = {-2,0,10,-19,4,6,-8};
        boolean ans = checkExists(arr);
        System.out.println(ans);
    }

    static boolean checkExists(int[] arr) {
        Arrays.sort(arr);
        int returnNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == 0 && arr[i-1] !=0) {
                continue;
            }
            returnNumber = binarySearch(arr, 2*arr[i], 0, arr.length-1);
            if (returnNumber != -1) {
                return true;
            }
        }
        return false;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end-start)/2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (target < arr[mid]) {
                end = mid-1;
            }

            else if (arr[mid] < target) {
                start = mid+1;
            }
        }
        return -1;
    }
}
