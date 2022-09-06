package com.Burhan;


public class First_Occurence {
    public static void main(String[] args) {
        int[] arr = {1, 10, 10, 10, 20, 20, 40};
        int x = 20;

        int ans = recursiveBS(arr, x, 0, arr.length-1);
        System.out.println(ans);

    }

    // O(n)
    static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // O(logn)
    static int binarySearch(int[] arr, int x) {
        int s = 0;
        int e = arr.length-1;

        while (s <= e) {
            int m = s+(e-s)/2;

            if (arr[m] > x) {
                e = m-1;
            }
            else if (arr[m] < x) {
                s = m+1;
            }
            else if (m == 0 || arr[m-1] != arr[m]) {
                return m;
            }
            else {
                e = m-1;
            }
        }

        return -1;
    }

    // O(logn)
    static int recursiveBS(int[] arr, int x, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end-start)/2;

        if (arr[mid] > x) {
            return recursiveBS(arr, x, start, mid-1);
        }
        else if (arr[mid] < x) {
            return recursiveBS(arr, x, mid+1, end);
        }
        else if (mid == 0 || arr[mid-1] != arr[mid]) {
            return mid;
        }
        else {
            return recursiveBS(arr, x, start, mid-1);
        }
    }
}